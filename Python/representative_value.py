n = int(input())
scores = list(map(int, input().split()))

sub = 0
avg = round(sum(scores) / n)
for num, score in scores:
    sub = abs(score - avg)