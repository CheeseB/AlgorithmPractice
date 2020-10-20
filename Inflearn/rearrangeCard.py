cards = list(range(21))

for _ in range(10):
    a, b = map(int, input().split())

    for i in range((b-a+1)//2):
        cards[a+i], cards[b-i] = cards[b-i], cards[a+i]

for card in cards:
    if card == 0:
        continue
    print(card, end=' ')

