a=int(input("Enter the value of a \n"))
b=int(input("ENter the value of b\n"))
gcd = 1
i = 1
while i<=a and i<=b:
    if a%i==0 and b%i==0:
        gcd=i;
    i=i+1
print(gcd)