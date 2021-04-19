# https://www.codewars.com/kata/52bc74d4ac05d0945d00054e

def first_non_repeating_letter(string):
    input_string = string
    input_string = input_string.lower()
    l = list(input_string)
    
    for i, c in enumerate(l):
        if l.count(c) == 1:
            return string[i]
    
    return ''
