n=int(input())
num1=[]
num2=[]
for i in range(0,n):
    ele=int(input())
    num1.append(ele)
print("1st arr:",num1)
for i in range(0,n):
    ele=int(input())
    num2.append(ele)
print("2st arr:",num2)
def intersection(num1,num2):
    return list(set(num1) & set(num2))
a=intersection(num1,num2)
print(a)
    