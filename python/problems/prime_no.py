a=int(input("Enter the number"))
isPrime = True
if a < 2:
    print("Not a prime number")
else:
 for i in range(2,a):
    if a % i == 0:
        isPrime=False
        break
if isPrime:
    print("Prime number")
else:
    print("Not a prime number")