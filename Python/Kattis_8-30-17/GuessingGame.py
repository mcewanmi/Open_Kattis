guess = int(input())
values=[1,2,3,4,5,6,7,8,9,10]

dH = False
count = 0

while guess != 0 and count <= 2500:

    
    response = input()
    
    if response == "too high":
        for x in range(guess-1, 10):
            values[x] = 'x'

    elif response == "too low":
        for x in range(0, guess):
            values[x] = 'x'

    elif response == "right on":
        if (values[guess-1] == 'x'):
            dH=True

        if dH == True:
            print("Stan is dishonest")
        else:
            print("Stan may be honest")
        dH=False
        values =[1,2,3,4,5,6,7,8,9,10]
        
    
    count+=1
    guess=int(input())

