pw, string = input().split()
fail=False

for x in range(0, len(pw)):
    if pw[x] in string:
        temp=string.find(pw[x])
        string=string[:temp]+'x'+string[temp+1:]
        if x<len(pw)-1:
            for y in range(x, len(pw)):
                if pw[y] in string[:temp]:
                    fail=True
            
    else:
        fail=True

if not fail:
    print("PASS")
else:
    print("FAIL")
