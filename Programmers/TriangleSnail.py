def solution(n):
    length = 0
    for i in range(1, n+1):
        length += i
    answer = [0] * length
    idx = 0
    num = 1
    floor = 1
    for i in range(n):
        for _ in range(n-i):
            answer[idx] = num
            num += 1
            if i % 3 == 0:  # left
                idx += floor
                floor += 1
            elif i % 3 == 1:  # bottom
                idx += 1
            else:  # right
                idx -= floor
                floor -= 1
        if i % 3 == 0:  # left bottom
            floor -= 1
            idx = idx - floor + 1
        elif i % 3 == 1:  # bottom right
            idx = idx - floor - 1
            floor -= 1
        else:  # right top
            floor += 1
            idx = idx + (floor * 2)
            floor += 1

    return answer
