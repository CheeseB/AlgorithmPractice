tests = int(input())

for test in range(tests):
    word = input().upper()

    if word == word[::-1]:
        print('#%d YES' % (test + 1))
    else:
        print('#%d NO' % (test + 1))
