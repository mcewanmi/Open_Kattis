n = int(input())

for x in range(0,n):
    noAd, revAd, costAd = [int(n) for n in input().split()]

    if revAd - costAd > noAd:
        print("advertise")
    elif revAd - costAd < noAd:
        print("do not advertise")
    else:
        print("does not matter")
