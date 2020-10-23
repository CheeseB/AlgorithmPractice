n = int(input())
farm = [list(map(int, input().split())) for _ in range(n)]
apple = 0
harvCnt = 1
start = n//2

for i in range(n):
    harvest = start
    for _ in range(harvCnt):
        apple += farm[i][harvest]
        harvest += 1
    if i < n//2:
        harvCnt += 2
        start -= 1
    else:
        harvCnt -= 2
        start += 1

print(apple)
