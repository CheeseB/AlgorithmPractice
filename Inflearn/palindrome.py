tests = int(input())

for test in range(1, tests + 1):
    print('#' + str(test), end=' ')
    word = input().upper()
    length = len(word)
    isPal = True

    for i, char in enumerate(word):
        if i >= (length // 2):
            break
        if char != word[length - i - 1]:
            isPal = False

    if isPal:
        print('YES')
    else:
        print('NO')
