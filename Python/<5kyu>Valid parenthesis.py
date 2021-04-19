# https://www.codewars.com/kata/52774a314c2333f0a7000688

def valid_parentheses(string):
    if len(string) == 0 or (string.count('(') + string.count(')')) == 0:
        return True
    if string.count('(') != string.count(')'):
        return False

    opening = 0
    closing = 0
    
    for s in string:
        if s == '(':
            opening += 1
        elif s == ')':
            closing += 1
        if closing > opening:
            return False
    
    return True
