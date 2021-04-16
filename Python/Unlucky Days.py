import datetime

def unlucky_days(year):
    fridays = 0
    for i in range (12):
        day = datetime.date(year,i + 1, 13).weekday()
        if day == 4:
            fridays += 1
    
    return fridays
