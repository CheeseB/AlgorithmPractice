import math


def reverse(x):
    revStr = str(x)[::-1]
    return int(revStr)


def isPrime(x):
    if x < 2:
        return False
    elif x == 2:
        return True
    else:
        for i in range(2, math.ceil(math.sqrt(x)) + 1):
            if x % i == 0:
                return False
        return True


_ = int(input())
test_list = list(map(int, input().split()))

for num in test_list:
    revNum = reverse(num)
    if isPrime(revNum):
        print(revNum, end=' ')
