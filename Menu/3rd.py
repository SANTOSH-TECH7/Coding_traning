menu={"Pizza":200,"burger":250,"Biriyani":250}
print("Menu:")

for i in menu:
    print(i, ":", menu[i])

ordered_list=[]

while True:
    choice=input("Order (yes or no)")
    if choice=='yes':
        order=input("Enter the food you want to order: ")
        q=int(input("Enter how many plates: "))
        ordered_list.append(order)
    elif choice=="no":
        print("Thank you !!!")
        break
total_amt=0
for i in ordered_list:
    total_amt=menu[i]*q

if total_amt>500:
    print("You have 10% discount for the orders")
    total_amt*=0.9
    print("The discounted amount to be paid :",total_amt)

print("The total amount for the order is:",total_amt)




