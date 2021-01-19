def solution(n):
    answer = [0] * (n * (n + 1) // 2)
    idx = 0
    num = 1
    floor = 0
    for i in range(n):
        for _ in range(n-i):
            if i%3 == 0: #left
                idx += floor
                floor += 1
            elif i%3 == 1: #bottom
                idx += 1
            else: #right
                idx -= floor
                floor -= 1
            answer[idx] = num
            num += 1
    return answer
