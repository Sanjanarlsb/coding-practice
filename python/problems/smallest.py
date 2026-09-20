numbers = [25, 8, 42, 3, 17, 10]
smallest =  numbers[0]
for i in range(0,6):
    if numbers[i] < smallest:
        smallest =  numbers[i]
print(smallest)