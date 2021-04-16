def is_isogram(string):
    if string == "":
        return True
    string = string.lower()
    
    for c in string:
        if string.count(c) > 1:
            return False
    return True
