def number(bus_stops):
    nr_of_people = 0
    for t in bus_stops:
        nr_of_people += t[0]
        nr_of_people -= t[1]
    
    return nr_of_people
