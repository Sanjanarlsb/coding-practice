n=int(input("Enter until where you wish to have fibanocci numbers"))
a = 0
b = 1
c = 0
while c <= n:
    c = a + b
    if c <= n:
       print(c)
    a = b
    b = c
    