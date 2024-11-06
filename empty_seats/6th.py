N = int(input("Enter the number of packets: "))
ans = []

for i in range(N):
    temp = int(input("Enter a value: "))
    if (temp not in ans or temp==0):
        ans.append(temp)

ans.sort()

zeros = 0
for i in range(N):
    if (ans[i]!=0):
        break
    zeros += 1

ans = ans[zeros:] + ans[:zeros]

print(ans)