def count(length):
    cnt = 0
    # lanList 전역변수가 함수 선언보다 밑에 선언되어도 사용 가능함
    for lan in lanList:
        cnt += (lan // length)
    return cnt


# 여기 선언된 변수들은 전역변수로 취급되기 때문에
# 함수의 인자로 넣어주지 않아도 사용이 가능함
k, n = map(int, input().split())
lanList = []
for _ in range(k):
    lanList.append(int(input()))
res = 1
lt = 0
rt = max(lanList)

while lt <= rt:
    mid = (lt + rt) // 2
    # mid 변수는 지역변수라서
    # 함수의 인자로 넣어줘야만 사용이 가능함
    if count(mid) >= n:
        res = mid
        lt = mid + 1
    else:
        rt = mid - 1

print(res)
