from math import sqrt

def find_next_square(sq):
    n = sqrt(sq)
    if n.is_integer() == False:
        return -1
    else:
        while True:
            sq += 1
            n = sqrt(sq)
            if n.is_integer():
                return sq
