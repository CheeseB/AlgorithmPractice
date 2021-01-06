test = int(input())
correctList = list(map(int, input().split()))
plus = 0
score = 0

for correct in correctList:
    plus += 1
    if correct == 0:
        plus = 0
    score += plus

print(score)
