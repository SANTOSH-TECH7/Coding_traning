m=int(input())
n=int(input())
if m>n:
    print(0)
else:
    total=0
    for i in range(m,n+1):
        total+=i*i*i
    print(total)
        