numbers = [12, 5, 8, 21, 4, 16, 9]
smallest = numbers[0]
secondSmallest = numbers[0]
for i in range(0,7):
    if numbers[i] < smallest:
        secondSmallest = smallest
        smallest = numbers[i]
    elif numbers[i] < secondSmallest:
        secondSmallest = numbers[i]
print(secondSmallest)