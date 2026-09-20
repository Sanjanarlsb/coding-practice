numbers = [10, 7, 4, 13, 8, 21, 6]
even = 0
odd = 0
for i in range(0,7):
    if numbers[i] % 2 == 0:
        even=even + 1
    else :
        odd = odd + 1
print(even)
print(odd)