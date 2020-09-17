r, c, zr, zc = map(int, input().split())

for i in range(r):
    line = input()
    newLine = [0] * c * zc

    idx = 0
    for j in range(c):
        for _ in range(zc):
            newLine[idx] = line[j]
            idx += 1

    for _ in range(zr):
        print(''.join(newLine))
