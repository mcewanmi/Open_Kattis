import math

N, P = input().split()

scores=[]
scores=input().split()

sTot=0
for x in scores:
    sTot+=int(x)

x=int(N)

if (P != '100'):
    while math.floor(sTot/x) < int(P) or math.ceil(sTot/x) < int(P):
       sTot+=100
       x+=1
       #print("floor", math.floor(sTot/x), "ceil", math.ceil(sTot/x), "int(p)", int(P))

if P != '100' or math.floor(sTot/x) == int(P) or math.ceil(sTot/x) == int(P):
    #print("impossible")
    print(x-int(N))
else:
    print("impossible")
    #print(x-int(N))
