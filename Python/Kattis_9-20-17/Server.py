n, T = input().split()

tasks=[]
tasks=input().split()

math=0
x=0
while x < len(tasks) and math+int(tasks[x]) <= int(T):
    math+=int(tasks[x])
    x+=1

print(x)
