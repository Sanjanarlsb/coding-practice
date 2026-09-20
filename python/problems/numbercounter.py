numbers = [10, 20, 10, 30, 10, 40, 20]
count = 0
a = int(input("Enter the number of which the frequency is to be counted"))
for i in range(0,7):
    if numbers[i] == a:
        count=count+1
print(count)
