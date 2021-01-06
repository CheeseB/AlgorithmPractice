n = int(input())
land = [list(map(int, input().split())) for _ in range(n)]
land.insert(0, [0] * n)  # 2차원 리스트 맨 첫줄에 한줄 추가
land.append([0] * n)  # 2차원 리스트 맨 끝줄에 한줄 추가
for line in land:
    # 각 줄의 처음과 끝에 0 추가
    line.insert(0, 0)
    line.append(0)

# 각 칸의 상하좌우를 비교할 수 있도록 방향 저장
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

res = 0

for i in range(1, n+1):
    for j in range(1, n+1):
        # 모든 k에 대해서 조건을 만족하면 참
        if all(land[i][j] > land[i+dx[k]][j+dy[k]] for k in range(4)):
            res += 1

print(res)
