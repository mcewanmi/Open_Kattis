numPlaces=int(input())
numItems=[]
*numItems=input.split()
numRoads=int(input())
road=[[0 for x in range(3)] for y in range(numRoads)]
for x in range(0, numRoads):
    road[x]=input()
