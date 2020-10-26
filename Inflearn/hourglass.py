n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]
newGrid = [[0] * n for _ in range(n)]
for i in range(n):
    for j in range(n):
        newGrid[i][j] = grid[i][j]

m = int(input())
for _ in range(m):
    row, way, rotate = map(int, input().split())
    row -= 1
    if way == 1:
        for i in range(n):
            col = (i + rotate) % n
            newGrid[row][col] = grid[row][i]
    else:
        for i in range(n):
            col = (n + i - rotate) % n
            newGrid[row][col] = grid[row][i]
    for j in range(n):
        grid[row][j] = newGrid[row][j]

res = 0
start = 0
end = n
for i in range(n):
    for j in range(start, end):
        res += newGrid[i][j]
    if i >= n//2:
        start -= 1
        end += 1
    else:
        start += 1
        end -= 1

print(res)
