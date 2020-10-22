n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]
sums = [[0] * (n + 1) for _ in range(2)]

for i in range(n):
    for j in range(n):
        sums[0][i] += grid[i][j]
        sums[1][j] += grid[i][j]
        if i == j:
            sums[0][n] += grid[i][j]
        if i + j == n - 1:
            sums[1][n] += grid[i][j]

if max(sums[0]) < max(sums[1]):
    print(max(sums[1]))
else:
    print(max(sums[0]))
