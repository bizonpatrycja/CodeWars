# https://www.codewars.com/kata/5270d0d18625160ada0000e4

def score(dice):
    points = 0
    
    if dice.count(1) >= 3:
        points += 1000
        [dice.remove(1) for i in range(3)]
    elif dice.count(6) >= 3:
        points += 600
        [dice.remove(6) for i in range(3)]
    elif dice.count(5) >= 3:
        points += 500
        [dice.remove(5) for i in range(3)]
    elif dice.count(4) >= 3:
        points += 400
        [dice.remove(4) for i in range(3)]
    elif dice.count(3) >= 3:
        points += 300
        [dice.remove(3) for i in range(3)]
    elif dice.count(2) >= 3:
        points += 200
        [dice.remove(2) for i in range(3)]
        
    for i in dice:
        if i == 1:
            points += 100
        if i == 5:
            points += 50
    
    return points
        
