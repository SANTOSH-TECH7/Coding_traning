n=int(input("Enter the size"))
a=[n]
for i in range(n):
    ele=int(input())
    a.append(ele)
count=0
prev=a[0]%2
for i in range(1,len(a)):
    if a[i]%2!=prev:
        count+=1
        prev=a[i]%2
print("The total number times the pen is changed is :",count)
