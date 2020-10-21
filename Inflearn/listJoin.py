_ = int(input())
list1 = list(map(int, input().split()))
_ = int(input())
list2 = list(map(int, input().split()))

res = list1 + list2
res.sort()

for x in res:
    print(x, end=' ')
