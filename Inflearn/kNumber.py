t = int(input())

for i in range(t):
    n, s, e, k = map(int, input().split())
    num_list = list(map(int, input().split()))

    list_part = num_list[s-1:e]
    list_part.sort()

    print("#%d %d" % (i+1, list_part[k-1]))
