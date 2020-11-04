n, m = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()

start = 0
end = n
while start <= end:
    mid = (start + end) // 2
    if nums[mid] == m:
        print(mid + 1)
        break
    elif nums[mid] < m:
        start = mid
    else:
        end = mid
