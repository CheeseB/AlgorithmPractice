cards = list(range(1, 21))

for _ in range(10):
    a, b = map(int, input().split())

    for i in range((b-a+1)//2):
        cards[a+i-1], cards[b-i-1] = cards[b-i-1], cards[a+i-1]

for card in cards:
    print(card, end=' ')

