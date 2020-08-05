n = int(input())
scores = list(map(int, input().split()))

min_sub = 101
result_num = 0
avg = round(sum(scores) / n)

for num, score in enumerate(scores):
    sub = abs(score - avg)
    if sub <= min_sub:
        if sub == min_sub and score <= scores[result_num]:
            continue
        min_sub = sub
        result_num = num

print(avg, result_num+1)
