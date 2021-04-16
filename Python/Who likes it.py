# https://www.codewars.com/kata/5266876b8f4bf2da9b000362

def likes(names):
    if len(names) == 0:
        return ('no one likes this')
    elif len(names) == 1:
        return (names[0] + ' likes this')
    elif len(names) == 2:
        return (names[0] + ' and ' + names[1] + ' like this')
    elif len(names) == 3:
        return (names[0] + ', ' + names[1] + ' and ' + names[2] + ' like this')
    else:
        return (names[0] + ', ' + names[1] + ' and ' + str(len(names) - 2) + ' others like this')

    
def likes2(names):
    return{
        0: 'no one likes this',
        1: '{} likes this',
        2: '{} and {} like this',
        3: '{}, {} and {} like this',
        4: '{}, {} and {rest} others like this'
    }[min(4,len(names))].format(*names[:3], rest = len(names) - 2)
