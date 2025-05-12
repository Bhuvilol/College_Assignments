import tkinter as tk
from tkinter import filedialog, scrolledtext
from lock import runlock
from open import runopen

class Box:
    def __init__(self, win):
        self.win = win
        self.win.title("Locker")
        self.win.geometry("500x350")

        self.path = tk.StringVar()
        self.passkey = tk.StringVar()

        self.make()

    def make(self):
        tk.Label(self.win, text="File:").pack(pady=5)
        line = tk.Frame(self.win)
        line.pack()

        tk.Entry(line, textvariable=self.path, width=40).pack(side=tk.LEFT)
        tk.Button(line, text="Pick", command=self.pick).pack(side=tk.LEFT, padx=5)

        tk.Label(self.win, text="Key:").pack(pady=5)
        tk.Entry(self.win, textvariable=self.passkey, show="*", width=40).pack()

        acts = tk.Frame(self.win)
        acts.pack(pady=10)

        tk.Button(acts, text="Lock", width=15, command=self.dolock).pack(side=tk.LEFT, padx=5)
        tk.Button(acts, text="Open", width=15, command=self.doopen).pack(side=tk.LEFT, padx=5)

        tk.Label(self.win, text="Notes:").pack()
        self.text = scrolledtext.ScrolledText(self.win, width=60, height=10)
        self.text.pack(pady=5)

    def write(self, line):
        self.text.insert(tk.END, line + "\n")
        self.text.see(tk.END)

    def pick(self):
        pick = filedialog.askopenfilename()
        if pick:
            self.path.set(pick)
            self.write(f"Picked: {pick}")

    def dolock(self):
        file = self.path.get()
        key = self.passkey.get()

        if not file or not key:
            self.write("Pick file and type key.")
            return

        ok, note = runlock(file, key)
        self.write(note)

    def doopen(self):
        file = self.path.get()
        key = self.passkey.get()

        if not file or not key:
            self.write("Pick file and type key.")
            return

        ok, note = runopen(file, key)
        self.write(note)
