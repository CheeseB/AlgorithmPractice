line = input()
num = 0
cnt = 0

for x in line:
    if x.isdecimal():
        # isdigit(): 모든 숫자 자료형 취급
        # isdecimal(): 0 ~ 9까지만
        num = (num * 10) + int(x)

for i in range(1, num + 1):
    if num % i == 0:
        cnt += 1

print(num)
print(cnt)
