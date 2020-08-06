n, m = map(int, input().split())

sum_list = [0] * (n+m+3)
for i in range(1, n+1):
    for j in range(1, m+1):
        sum_list[i+j] += 1

max_sum = max(sum_list)
results = [idx for idx, value in enumerate(sum_list) if value == max_sum]

for result in results:
    print(result, end=' ')
