# A=['GR','RR', 'GR', 'RG','GR','GR','RR']
# b=[]
# i=0
# while i<(len(A)-1):
#     l_char=A[i][-1]
#     f_char=A[i+1][0]
#     if l_char==f_char:
#         b.append ((A[i],A[i+1]))
#     else:
#         A.pop(i+1)
#     i+=1
# print(b)
in this code it is not printing the last value

Changing the list itself
A=['GR','RR', 'GR', 'RG','GR','GR','RR']
i=0
while i<(len(A)-1):
    l_char=A[i][-1]
    f_char=A[i+1][0]
    if l_char!=f_char:
        A.pop(i+1)
    else:
        i+=1
print(A)
        
        
        