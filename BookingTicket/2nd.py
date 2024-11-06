age=int(input())
quantity=int(input())
t_max=0
if (age>60):
    p=30
    t_max=quantity*p+t_max
elif (age>12 and age<60):
    p=50
    t_max=quantity*p+t_max
elif (age<12):
    p=20
    t_max=quantity*p+t_max
print(t_max)
    
