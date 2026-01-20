# ============================================================
# QUESTION 1(a): TEXT PRE-PROCESSING & TF-IDF FEATURE EXTRACTION
# ============================================================

import pandas as pd
import re

from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.model_selection import train_test_split
from sklearn.svm import LinearSVC, SVC
from sklearn.metrics import accuracy_score, confusion_matrix, classification_report

# Load dataset
data = pd.read_csv("review_sentiment_dataset.csv")

# Text preprocessing (lowercase + noise removal)
data['review'] = data['review'].str.lower()
data['review'] = data['review'].str.replace(r'[^a-z\s]', '', regex=True)

# Separate input and output
X_text = data['review']
y = data['sentiment']

# TF-IDF feature extraction
tfidf = TfidfVectorizer(stop_words="english")
X = tfidf.fit_transform(X_text)


# ============================================================
# QUESTION 1(b): TRAINING THE SVM CLASSIFIER
# ============================================================

# Train-test split (80–20)
X_train, X_test, y_train, y_test = train_test_split(
    X,
    y,
    test_size=0.2,
    random_state=0,
    stratify=y
)

# Train Linear SVM
svm_model = LinearSVC(random_state=0)
svm_model.fit(X_train, y_train)


# ============================================================
# QUESTION 1(c): PREDICTION ON UNSEEN REVIEWS
# ============================================================

new_reviews = [
    "The product is good but delivery is slow",
    "Excellent quality and fast service",
    "The item is okay, nothing special"
]

# Preprocess unseen reviews
new_reviews_clean = [re.sub(r'[^a-z\s]', '', r.lower()) for r in new_reviews]

# Convert to TF-IDF
new_reviews_tf = tfidf.transform(new_reviews_clean)

# Predict sentiment
predictions = svm_model.predict(new_reviews_tf)

print("Q1(c) – Predictions on Unseen Reviews:")
for r, p in zip(new_reviews, predictions):
    print(r, "->", p)


# ============================================================
# QUESTION 2: MODEL EVALUATION
# ============================================================

# Predictions on test data
y_pred = svm_model.predict(X_test)

# Accuracy
print("Accuracy:", accuracy_score(y_test, y_pred))

# Confusion Matrix
print("\nConfusion Matrix:")
print(confusion_matrix(y_test, y_pred))

# Precision, Recall, F1-score
print("\nClassification Report:")
print(classification_report(y_test, y_pred))


# ============================================================
# QUESTION 3: EXPLAINABLE CLASSIFICATION (PREDICTION PROBABILITY)
# ============================================================

# Train SVM with probability enabled (same dataset)
svc_model = SVC(kernel="linear", probability=True, random_state=0)
svc_model.fit(X_train, y_train)

# Prediction probabilities on test data
y_prob = svc_model.predict_proba(X_test)
print("Class Probabilities:", y_prob[0])
print("Predicted Class:", svc_model.predict(X_test)[0])


# ============================================================
# QUESTION 4: FEATURE IMPORTANCE (WHY THE MODEL DECIDED)
# ============================================================

# Feature importance from Linear SVM
feature_names = tfidf.get_feature_names_out()
weights = svm_model.coef_

# Map weights to words
feature_importance = pd.DataFrame(
    weights.T,
    index=feature_names,
    columns=["Negative", "Neutral", "Positive"]
)

print("\nTop Positive Words:")
print(feature_importance["Positive"].sort_values(ascending=False).head(5))

print("\nTop Negative Words:")
print(feature_importance["Negative"].sort_values(ascending=False).head(5))

print("\nTop Neutral Words:")
print(feature_importance["Neutral"].sort_values(ascending=False).head(5))
