def solution(clothes):
    dic = {}
    for _, key in clothes:
        if key in dic:
            dic[key] += 1
        else:
            dic[key] = 1

    answer = 1
    for val in dic.values():
        answer *= (val + 1)

    return answer - 1
