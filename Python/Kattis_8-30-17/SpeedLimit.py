n = int(input())

while (n != -1):
    time=[]
    dist=0
    for x in range(0, n):
        s, t = input().split()
        s=int(s)
        t=int(t)
        time.append(t)
        if (x != 0):
            dist+=(s*(time[-1]-time[-2]))
        else:
            dist+=s*t


    print(dist, "miles")

    
    n = int(input())
    
