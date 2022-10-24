num=int(input("Enter a number: "))
c = 0

while num != 0:
    num //= 10
    c += 1

print("Number of digits: " + str(c))
