import subprocess

def runlock(path, key):
    out = path + ".lock"
    job = ["openssl", "enc", "-aes-256-cbc", "-salt", "-in", path, "-out", out, "-k", key]

    try:
        done = subprocess.run(job, capture_output=True, text=True)
        if done.returncode == 0:
            return True, f"Locked: {out}"
        else:
            return False, f"Lock fail: {done.stderr.strip()}"
    except Exception as bug:
        return False, f"Lock error: {str(bug)}"
