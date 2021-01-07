def sudoku(board):
    for i in range(9):
        rowList = [0] * 10
        colList = [0] * 10
        for j in range(9):
            rowList[board[i][j]] = 1
            colList[board[j][i]] = 1
        if sum(rowList) != 9 or sum(colList) != 9:
            return "NO"

    for i in range(0, 9, 3):
        for j in range(0, 9, 3):
            groupList = [0] * 10
            for k in range(3):
                for s in range(3):
                    groupList[board[i+k][j+s]] = 1
            if sum(groupList) != 9:
                return "NO"

    return "YES"


inputBoard = [list(map(int, input().split())) for _ in range(9)]
print(sudoku(inputBoard))
