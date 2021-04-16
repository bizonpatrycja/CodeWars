def printer_error(s):
    counter = 0
    for c in s:
        if ord(c) > 109:
            counter += 1
    
    return str(counter) + "/" + str(len(s))
