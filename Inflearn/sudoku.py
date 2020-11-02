board = [list(map(int, input().split())) for _ in range(9)]

for i in range(9):
    rowList = [0] * 10
    colList = [0] * 10

    for j in range(9):
        rowList[board[i][j]] += 1
        colList[board[j][i]] += 1

    if max(rowList) > 1 or max(colList) > 1:
        print("NO")
        break

else:
    print("YES")
