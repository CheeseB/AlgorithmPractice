tests = int(input())

for test in range(tests):
    word = input().upper()
    length = len(word)

    # 파이썬은 인덱스 접근을 거꾸로 음수로도 할 수 있음!
    # -1이 맨 끝 인덱스, 숫자가 낮아질수록 앞 인덱스로 감
    #  0  1  2  3  4
    # |--|--|--|--|--|
    #  -5 -4 -3 -2 -1

    for i in range(length // 2):
        if word[i] != word[-1-i]:
            print('#%d NO' % (test + 1))
            break
    else:
        print('#%d YES' % (test + 1))
