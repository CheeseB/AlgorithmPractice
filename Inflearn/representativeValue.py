n = int(input())
scores = list(map(int, input().split()))

min_sub = 101
result_num = 0

# round_half_up이 우리가 쓰는 반올림 방법이지만
# round 함수는 round_half_even 방식을 사용함.
# 이는 반절의 수(5) 를 짝수로 반올림하는 방식임.
# 예시> 4.500 = 4 , 4.501 = 5 , 5.500 = 6

# 그러므로 파이썬에서 반올림을 할 땐 아래와 같이 써야함.
avg = int((sum(scores) / n) + 0.5)

for num, score in enumerate(scores):
    sub = abs(score - avg)
    if sub <= min_sub:
        if sub == min_sub and score <= scores[result_num]:
            continue
        min_sub = sub
        result_num = num

print(avg, result_num+1)
