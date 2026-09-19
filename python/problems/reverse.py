a=int(input("ENter the number"))
reverse = 0
while a > 0:
    digit = a % 10
    reverse = reverse*10 + digit
    a = a // 10
print(reverse)
