from itertools import combinations


def solution(clothes):
    dic = {}
    for _, key in clothes:
        if key in dic:
            dic[key] += 1
        else:
            dic[key] = 1

    keyList = list(dic)
    if all(x == 1 for x in dic.values()):
        answer = 2 ** len(keyList) - 1
    else:
        answer = sum(dic.values())
        for i in range(2, len(keyList) + 1):
            for comb in list(combinations(keyList, i)):
                mul = 1
                for key in comb:
                    mul *= dic[key]
                answer += mul

    return answer
