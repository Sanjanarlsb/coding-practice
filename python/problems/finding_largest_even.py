numbers = [15, 22, 7, 40, 13, 18, 9, 32]
largest = 0
for i in range(0,8):
    if numbers[i] % 2 == 0:
        if numbers[i] > largest:
            largest = numbers[i]
print(largest)
        

