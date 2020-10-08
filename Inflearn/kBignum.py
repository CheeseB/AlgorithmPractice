n, k = map(int, input().split())
cards = list(map(int, input().split()))
sums = set()

for a in range(n-2):
    for b in range(a+1, n-1):
        for c in range(b+1, n):
            sums.add(cards[a] + cards[b] + cards[c])

sum_list = list(sums)
sum_list.sort(reverse=True)
print(sum_list[k-1])
