tests = int(input())

for test in range(1, tests + 1):
    print('#' + str(test), end=' ')
    word = input().upper()

    if word == word[::-1]:
        print('YES')
    else:
        print('NO')
