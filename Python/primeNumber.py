maxNum = int(input())
board = [0] * (maxNum + 1)
answer = 0

for i in range(2, maxNum + 1):
    if board[i] == 0:
        answer += 1
        for j in range(i, maxNum + 1, i):
            board[j] = 1

print(answer)
