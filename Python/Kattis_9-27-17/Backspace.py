line = input()

num = line.count('<')
for x in range(0, num):
    if '<' in line:
        line=line.replace(line[line.find('<')-1:line.find('<')+1], "")
print(line)
