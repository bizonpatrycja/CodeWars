# https://www.codewars.com/kata/52b7ed099cdc285c300001cd

def sum_of_intervals(intervals):
    elements = list(set([j for i in intervals for j in range(i[0], i[1])]))
    return len(elements)
