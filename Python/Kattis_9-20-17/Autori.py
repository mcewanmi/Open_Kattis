names = input()

vari=names[0]

hyphens = [pos for pos, char in enumerate(names) if char == '-']

for c in hyphens:
    vari+=names[c+1]

print(vari)
