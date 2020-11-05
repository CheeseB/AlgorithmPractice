k, n = map(int, input().split())
lanList = list()
for _ in range(k):
    lanList.append(int(input()))
length = min(lanList)
lt = 0
rt = length
while lt <= rt:
    cnt = 0
    for lan in lanList:
        cnt += lan // length
    length = (lt + rt) // 2
    if cnt < n:
        rt = length
    else:
        lt = length

print(length)
