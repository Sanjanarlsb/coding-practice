numbers = [13, 8, 21, 16, 5, 42, 19, 10]
largest = numbers[1]
for i in range(0,8):
    if numbers[i] % 2 == 0 and  numbers[i] > largest:
        largest = numbers[i]
print(largest)