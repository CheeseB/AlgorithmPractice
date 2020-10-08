def reverse(x):
    revStr = str(x)[::-1]
    return int(revStr)

    # another solution #
    # res = 0
    # while x > 0:
    #     tmp = x % 10
    #     x = x // 10
    #     res = res * 10 + tmp
    # return res


def isPrime(x):
    if x < 2:
        return False
    for i in range(2, x//2 + 1):
        if x % i == 0:
            return False
    return True


_ = int(input())
test_list = list(map(int, input().split()))

for num in test_list:
    revNum = reverse(num)
    if isPrime(revNum):
        print(revNum, end=' ')
