grid = [list(map(int, input().split())) for _ in range(7)]
res = 0

for i in range(7):
    for j in range(3):
        for k in range(2):
            if grid[i][j+k] != grid[i][j-k+4]:
                break
        else:
            res += 1

for i in range(7):
    for j in range(3):
        for k in range(2):
            if grid[j+k][i] != grid[j-k+4][i]:
                break
        else:
            res += 1

print(res)
