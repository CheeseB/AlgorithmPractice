n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]
sum3 = sum4 = 0
maxSum = 0

for i in range(n):
    sum1 = sum2 = 0
    for j in range(n):
        sum1 += grid[i][j]
        sum2 += grid[j][i]
        if i == j:
            sum3 += grid[i][j]
        if i + j == n - 1:
            sum4 += grid[i][j]
    if sum1 > maxSum:
        maxSum = sum1
    if sum2 > maxSum:
        maxSum = sum2

if sum3 > maxSum:
    maxSum = sum3
if sum4 > maxSum:
    maxSum = sum4

print(maxSum)
