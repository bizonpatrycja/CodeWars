def likes(names):
    return{
        0: 'no one likes this',
        1: '{} likes this',
        2: '{} and {} like this',
        3: '{}, {} and {} like this',
        4: '{}, {} and {rest} others like this'
    }[min(4,len(names))].format(*names[:3], rest = len(names) - 2)
