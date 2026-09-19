a = int(input("Enter the number"))
original = a
reverse = 0
while a > 0:
    num = a % 10
    reverse = reverse*10 + num
    a = a//10
if(original == reverse):
    print("Palindrome number or sequence")
else:
    print("Not a palindrome sequence")