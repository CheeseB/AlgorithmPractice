person = int(input())
maxPrice = 0

for _ in range(person):
    numList = list(map(int, input().split()))
    if numList.count(numList[0]) == 3:
        price = 10000 + (numList[0] * 1000)
    elif numList.count(numList[0]) == 2:
        price = 1000 + (numList[0] * 100)
    elif numList.count(numList[1]) == 2:
        price = 1000 + (numList[1] * 100)
    else:
        price = max(numList) * 100

    if price > maxPrice:
        maxPrice = price

print(maxPrice)
