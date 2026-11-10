x = int(input("how many numbers would you like to sum "))
sum = 0
for count in range (1,x):
    print(count, end="+")
    sum = sum + count
print(x)
sum = sum + x
print ("the sum is " + str(sum))