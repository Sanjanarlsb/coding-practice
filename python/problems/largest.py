numbers = [10, 25, 7, 42, 18]
largest=numbers[0]
for i in range(0,5):
    if numbers[i] > largest:
        largest=numbers[i]
print(largest)
