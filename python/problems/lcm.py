a=int(input("Enter the value of a:\n"))
b=int(input("Enter the value of b:\n"))
lcm = 0
i = 1
while(True):
    if(i%a==0 and i%b==0):
        lcm = i
        break
    i=i+1
print(lcm)