def accum(s):
    result = ""
    for i in range(len(s)):
        if i > 0:
            result += "-"
        result += s[i].upper()
        for j in range(i):
            result += s[i].lower()
            
    return result
