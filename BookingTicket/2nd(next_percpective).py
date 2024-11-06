quantity=int(input("Enter how many tickets you want"))
t_max=0
for i in range(quantity):
    age=int(input("Enter  age of " + str(i+1) +   " person :"))
    if (age>60):
        t_max+=30
    elif (age<12):
        t_max+=20
    else :
        t_max+=50
print("Total amount to be paid",t_max)
        
