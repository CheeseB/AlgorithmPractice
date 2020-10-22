n, m = map(int, input().split())
numList = list(map(int, input().split()))

lt = 0
rt = 1
tot = numList[0]
cnt = 0

while True:
    if tot < m:
        if rt >= n:
            break
        tot += numList[rt]
        rt += 1
    else:
        if tot == m:
            cnt += 1
        tot -= numList[lt]
        lt += 1

print(cnt)
