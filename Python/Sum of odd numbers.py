def row_sum_odd_numbers(n):
    #sum of n first natural numbers = n(n+1)/2
    currentNumber = (n-1)*(n-1+1)/2 * 2 + 1
    sum = 0
    for i in range(n):
        sum += currentNumber
        currentNumber += 2
        
    return sum
