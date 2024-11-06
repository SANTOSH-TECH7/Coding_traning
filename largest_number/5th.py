n=int(input("Enter the number:"))
list_1=[]
for i in str(n):
    list_1.append(int (i))
list_1.sort(reverse=True)
digit=0
length=len(list_1)-1
for i in list_1:
    digit += i*(10**length)
    length-=1
print("The largest number is :",digit)


