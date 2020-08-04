n, k = map(int, input().split())
cards = list(map(int, input().split()))
sum_list = list()

for a in range(n-2):
    for b in range(a+1, n-1):
        for c in range(b+1, n):
            sum_list.append(cards[a] + cards[b] + cards[c])

sum_list = list(set(sum_list))
sum_list.sort(reverse=True)
print(sum_list[k-1])
