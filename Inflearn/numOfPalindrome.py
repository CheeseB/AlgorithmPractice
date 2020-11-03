grid = [list(map(int, input().split())) for _ in range(7)]
res = 0

for i in range(7):
    for j in range(3):
        # 2차원 리스트의 행 일부를 1차원 리스트로 슬라이스
        # j부터 j+5 전까지
        temp = grid[i][j:j+5]
        if temp == temp[::-1]:
            res += 1
        for k in range(2):
            if grid[j+k][i] != grid[j-k+4][i]:
                break
        else:
            res += 1

print(res)
