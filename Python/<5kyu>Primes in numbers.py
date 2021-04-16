# https://www.codewars.com/kata/54d512e62a5e54c96200019e

def prime_factors(n):
    p = 2
    curr_n = n
    prime_factors = []
    output = ''
    
    while p <= n:
        if curr_n%p == 0:
            prime_factors.append(p)
            curr_n /= p     
        else:
            if p in prime_factors:
                count = prime_factors.count(p)
                if count == 1:
                    output += '({})'.format(p)
                else:
                    output += '({}**{k})'.format(p, k=count)
            if curr_n == 1:
                return output
            p += 1
            
