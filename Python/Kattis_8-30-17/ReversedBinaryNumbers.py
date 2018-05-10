#take in input, convert to int
num = int(input())

#python function to convert int to binary
num=bin(num)

#python method to reverse order of string, python does not care about variable types
num=num[::-1]

#cut off end 2 characters of string, which are reversed '0b'
num=num[:-2]

#print the conversion of binary-->integer
print(int(num, 2))


#https://stackoverflow.com/questions/931092/reverse-a-string-in-python
#https://stackoverflow.com/questions/1476/how-do-you-express-binary-literals-in-python
