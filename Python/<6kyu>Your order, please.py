# https://www.codewars.com/kata/55c45be3b2079eccff00010f

def order(sentence):
    if len(sentence) == 0:
        return ""
    words = sentence.split()
    output = words.copy()
    
    for word in words:
        index = 0
        for c in word:
            if ord(c) >= 48 and ord(c) <= 57: #from ASCII table
                index = int(c)
                break
        output[index-1] = word
    
    return ' '.join(output)
