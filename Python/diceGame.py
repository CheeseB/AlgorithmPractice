person = int(input())
maxPrice = 0

for _ in range(person):
    dice = input().split()
    dice.sort()

    a, b, c = map(int, dice)
    if a == b == c:
        price = 10000 + (a * 1000)
    elif a == b:
        price = 1000 + (a * 100)
    elif b == c:
        price = 1000 + (b * 100)
    else:
        price = a * 100

    if price > maxPrice:
        maxPrice = price

print(maxPrice)
