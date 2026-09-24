a=int(input("Enter the value of a:\n"))
original = a
sum = 0
while a>0:
    digit = a % 10
    result=digit*digit*digit
    a = a // 10
    sum=sum+result
if sum==original:
    print("Armstrong")
else:
    print("Not an armstrong number")
     

