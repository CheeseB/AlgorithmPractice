n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

m = int(input())
for _ in range(m):
    row, way, rotate = map(int, input().split())
    row -= 1
    if way == 0:
        for _ in range(rotate):
            # 맨앞을 빼서 맨뒤로 붙임
            grid[row].append(grid[row].pop(0))
    else:
        for _ in range(rotate):
            # 맨뒤를 빼서 맨앞에 붙임
            grid[row].insert(0, grid[row].pop())

res = 0
start = 0
end = n
for i in range(n):
    for j in range(start, end):
        res += grid[i][j]
    if i >= n//2:
        start -= 1
        end += 1
    else:
        start += 1
        end -= 1

print(res)
