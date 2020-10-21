len1 = int(input())
list1 = list(map(int, input().split()))
len2 = int(input())
list2 = list(map(int, input().split()))

res = list()
p1 = 0
p2 = 0

while p1 < len1 and p2 < len2:
    if list1[p1] < list2[p2]:
        res.append(list1[p1])
        p1 += 1
    else:
        res.append(list2[p2])
        p2 += 1

while p1 < len1:
    res.append(list1[p1])
    p1 += 1

while p2 < len2:
    res.append(list2[p2])
    p2 += 1

for x in res:
    print(x, end=' ')
