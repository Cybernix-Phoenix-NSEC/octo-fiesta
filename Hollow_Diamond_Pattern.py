n=int(input("Enter the ODD numbers of layers : "))
m=(n+1)//2
for i in range(1, n + 1):
    if i==1 or i==n:
        print(" " * (m-1) + "*")
    elif (i<=m):
        o = (m-i)
        i = (2*(i - 1) - 1)
        print (" " * o + "*" + " " * i + "*")
    else:
        o = (i - m)
        i = (2*(n-i)-1)
        print (" " * o + "*" + " " * i + "*")
print ("End of the pattern...")
