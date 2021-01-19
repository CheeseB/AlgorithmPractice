def solution(number, k):
    answer = ''
    numlist = list(number)
    numlen = len(numlist)
    anslen = numlen - k
    start = 0

    for i in range(anslen):
        pick = start
        if numlist[pick] != "9":
            rest = anslen - i
            for j in range(start + 1, numlen - rest + 1):
                if numlist[j] > numlist[pick]:
                    pick = j
                    if numlist[j] == "9":
                        break
        answer += numlist[pick]
        start = pick + 1

    return answer
