from math import cos, radians, sin
from decimal import Decimal
numTests = int(input())

while numTests > 0:
    totalX=0.0
    totalY=0.0
    directions=[]
    worstDist=0.0
    distsX=[]
    distsY=[]
    for y in range(0, numTests):
        locX, locY, *directions=input().split()
        locY=float(locY)
        locX=float(locX)
        turn=0.0
        for x in range(0, len(directions)):
            if directions[x]=="start" or directions[x]=="turn":
                turn+=radians(float(directions[x+1]))
            elif directions[x]=="walk":
                locY+=sin(turn)*float(directions[x+1])
                locX+=cos(turn)*float(directions[x+1])

        totalX+=locX
        totalY+=locY
        distsX.append(locX)
        distsY.append(locY)

        
    totalX/=numTests
    totalY/=numTests
    
    for x in range(0, len(distsX)):
        dist=Decimal((distsX[x]-totalX)**2+(distsY[x]-totalY)**2).sqrt()
        if dist > worstDist:
            worstDist = dist
    
    print(format(totalX, '.5f').rstrip('0').rstrip('.'), format(totalY, '.5f').rstrip('0').rstrip('.'), format(worstDist, '.5f').rstrip('0').rstrip('.'))
    numTests=int(input())
