numbers = [10, 25, 7, 42, 18, 3, 30]
largest = numbers[0]
secondLargest = numbers[0]
for i in range(0,7):
     if numbers[i] > largest:
          secondLargest = largest
          largest = numbers[i]
     elif numbers[i] > secondLargest:
          secondLargest = numbers[i]     
print(secondLargest)