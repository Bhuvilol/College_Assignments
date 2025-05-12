import subprocess

def runopen(path, key):
    out = path.replace(".lock", ".open")
    job = ["openssl", "enc", "-d", "-aes-256-cbc", "-in", path, "-out", out, "-k", key]

    try:
        done = subprocess.run(job, capture_output=True, text=True)
        if done.returncode == 0:
            return True, f"Opened: {out}"
        else:
            return False, f"Open fail: {done.stderr.strip()}"
    except Exception as bug:
        return False, f"Open error: {str(bug)}"
