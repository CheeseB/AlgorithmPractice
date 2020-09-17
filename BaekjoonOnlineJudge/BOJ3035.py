r, c, zr, zc = map(int, input().split())

arr = [[0] * c for _ in range(r)]
for i in range(r):
    line = input()
    for j in range(c):
        arr[i][j] = line[j]

new_row = [0] * c * zc
for i in range(r):
    idx = 0
    for j in range(c):
        for _ in range(zc):
            new_row[idx] = arr[i][j]
            idx += 1
    for _ in range(zr):
        for word in new_row:
            print(word, end='')
        print()
