numbers = [10, 20, 10, 30, 20, 40, 10, 50]
unique=[]
for i in range(0,8):
    if numbers[i] not in unique:
        unique.append(numbers[i])
print(unique)
