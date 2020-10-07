import math

maxNum = int(input())
board = [0] * (maxNum + 1)

for i in range(2, math.ceil(math.sqrt(maxNum)) + 1):
    if board[i] == 0:
        j = 2
        while i * j <= maxNum:
            board[i * j] = 1
            j += 1

answer = 0
for i in range(2, maxNum + 1):
    if board[i] == 0:
        answer += 1

print(answer)
