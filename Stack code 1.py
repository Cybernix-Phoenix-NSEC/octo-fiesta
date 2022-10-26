#to push all the numbers divisible by 5 from a list and then pop them out and display the numbers


L=[10,19,36,55,20,73,92,45,105,33]
def push(s,n):
    s.append(n)
def pop(s):
    if s==[]:
        print("underflow...")
    else:
        p=s.pop()
        return p
        
sm=[]
for x in L:
    if x%5==0:
        push(sm,x)
for f in range(len(sm)-1,-1,-1):
    print (sm[f])
for i in range(len(sm)):
    print(pop(sm),end=" ")
    

