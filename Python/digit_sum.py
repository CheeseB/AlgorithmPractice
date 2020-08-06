def digit_sum(x):
    res = 0
    while x > 0:
        res += x % 10
        x //= 10
    return res


n = int(input())
nums = list(map(int, input().split()))
sum_list = [0] * n

max_hap = -1
result = 0
for num in nums:
    hap = digit_sum(num)
    if hap > max_hap:
        max_hap = hap
        result = num

print(result)
