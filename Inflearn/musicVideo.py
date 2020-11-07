def count(length):
    cnt = 1
    tot = 0
    for song in songs:
        tot += song
        if tot > length:
            tot = song
            cnt += 1

    return cnt


_, m = map(int, input().split())
songs = list(map(int, input().split()))
maxSong = max(songs)
lt = 1
rt = sum(songs)
res = 0

while lt <= rt:
    mid = (lt + rt) // 2
    if count(mid) <= m and mid >= maxSong:
        res = mid
        rt = mid - 1
    else:
        lt = mid + 1

print(res)
