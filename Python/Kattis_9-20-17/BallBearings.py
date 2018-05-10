import math
cases = int(input())

for x in range(0, cases):
    D, d, s = input().split()
    D, d, s = float(D), float(d), float(s)
    #print(D, d, s)
    cir=math.pi*(D/2.0-d/2.0)*2.0
    x=3
    dist=(d+s)*x

    while dist < cir:
        x+=1
        dist=(d+s)*x
        print("cir", cir)
        print("dist", dist)
        #print("dist", dist, "x", x)
    #print("cir", cir)
    #print("dist", dist)

    print(x)
