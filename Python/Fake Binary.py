def fake_bin(x):
    newStr = ""
    for c in x:
        if int(c) < 5:
            c = "0"
        else:
            c = "1"
        newStr += c
    return newStr
