# File Encryption & Decryption Tool (Python + OpenSSL)

This is a simple Python desktop app that helps you encrypt and decrypt files securely using OpenSSL and a clean GUI built with Tkinter.

## Features

- Browse and select any file to encrypt or decrypt
- AES-256-CBC encryption using OpenSSL
- Easy-to-understand Python code with separate logic files
- User-friendly GUI made using Tkinter
- Keeps both original and encrypted/decrypted files

## Folder Structure

locker/
├── start.py # Main entry point
├── screen.py # GUI and app logic
├── lock.py # File encryption logic
├── open.py # File decryption logic
└── README.md # This file

## Requirements

- Python 3.(any version)
- OpenSSL installed and accessible via the terminal/command prompt

> To verify OpenSSL:
```bash
openssl version
``` 
## How to Run
> TO install dependencies (Tkinter is usually included with Python):

```bash
pip install tk
```

## Run the app:
```bash
python start.py
```

## Run the app directly:
Double click on start.exe file to launch the application directly.
```
/dist/start.exe
```

## How It Works

#### Encrypt (Lock):

Adds .lock extension to the file (e.g., file.txt → file.txt.lock)

You must enter a password which is used as the encryption key

#### Decrypt (Open):

Creates a new .open version of the file (e.g., file.txt.lock → file.txt.lock.open)

Requires the same password used during encryption

If the wrong password is used during decryption, the process will fail silently or produce junk output.

## Testing Tips

Use a test .txt file for first runs

Try encrypting it with a sample password like 1234

Decrypt using correct and incorrect passwords to see error handling

The app will show results like Locked: file.txt.lock or Open fail: bad magic number

## Notes

This tool is for educational and demo purposes.

For real-world use, consider secure password handling, encryption validation, and hash verification.

Encrypted files can’t be recovered if the password is lost.

## Author

Bhabesh Behera


