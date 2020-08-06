def digit_sum(x):
    result = 0
    while x > 0:
        result += x % 10
        x //= 10
    return result


n = int(input())
nums = list(map(int, input().split()))
sum_list = [0] * n

for idx, num in enumerate(nums):
    sum_list[idx] = digit_sum(num)

found_idx = sum_list.index(max(sum_list))
print(nums[found_idx])
