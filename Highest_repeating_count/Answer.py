def max_solution(a):
    count={}
    #count the occurance of each value
    for num in a:
        if num in count:
            count[num]+=1
        else:
            count[num]=1
    #     print(count)
    # print(count.items)  #counts each item in the dict
    maxcount=0
    for k,v in count.items():        #checks the values in the created dictionary 
      if k==v and v>maxcount:       #for example : 3 : 3 checks  3==3 and 3>0 then maxcount=3
          maxcount=v
    return maxcount
    
    
    
    
a=[3,8,2,3,3,2,]
t=max_solution(a)
print(t)