testNum = int(input())

for _ in range(testNum):
    sentence = input()
    if sentence[:10] == "Simon says":
        print(sentence[10:])