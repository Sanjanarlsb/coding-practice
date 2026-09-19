a=int(input("Enter the number"))
count = 0
while a > 0:
    digit = a % 10
    a = a // 10
    count = count+1
print(count)

