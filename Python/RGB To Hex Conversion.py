def rgb(r, g, b):
    if r < 0:
        r = 0
    elif r > 255:
        r = 255
    if g < 0:
        g = 0
    elif g > 255:
        g = 255
    if b < 0:
        b = 0
    elif b > 255:
        b = 255
    
    rStr = hex(r)
    if len(rStr) > 2:
        rStr = rStr[2:]
    if len(rStr) < 2:
        rStr = "0" + rStr
   
    gStr = hex(g)
    if len(gStr) > 2:
        gStr = gStr[2:]
    if len(gStr) < 2:
        gStr = "0" + gStr
    
    bStr = hex(b)
    if len(bStr) > 2:
        bStr = bStr[2:]
    if len(bStr) < 2:
        bStr = "0" + bStr
    
    return (rStr + gStr + bStr).upper()
    
