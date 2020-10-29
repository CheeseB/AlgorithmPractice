n = int(input())
land = [[0] * (n+2) for _ in range(n+2)]
temp = [list(map(int, input().split())) for _ in range(n)]
for i in range(n):
    for j in range(n):
        land[i+1][j+1] = temp[i][j]
res = 0

for i in range(1, n+1):
    for j in range(1, n+1):
        left = land[i][j-1]
        right = land[i][j+1]
        up = land[i-1][j]
        down = land[i+1][j]
        if max(left, right, up, down) < land[i][j]:
            res += 1

print(res)
