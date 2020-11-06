k, n = map(int, input().split())
lanList = list()
for _ in range(k):
    lanList.append(int(input()))
lt = 0
rt = 1000
res = 0
while True:
    cnt = 0
    mid = (lt + rt) // 2
    for lan in lanList:
        cnt += lan // mid
    if cnt >= n:
        break
    rt = mid - 1

while cnt >= n:
    res = mid
    lt = mid + 1
    mid = (lt + rt) // 2
    cnt = 0
    for lan in lanList:
        cnt += lan // mid

print(res)
