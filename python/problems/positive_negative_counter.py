numbers = [10, -5, 7, -2, 0, 15, -8, 4]
positive = 0
negative = 0
for i in range(0,8):
    if numbers[i] > 0:
        positive = positive + 1
    elif numbers[i] < 0:
        negative = negative + 1
print(positive)
print(negative)