def namelist(names):
    n = len(names)
    if n == 0:
        return ''
    elif n == 1:
        return names[0]['name']
    else:
        s = ''
        for i in range(n-2):
            s += names[i]['name']
            s += ', '
        s += (names[-2]['name'] + " & " + names[-1]['name'])
        return s
