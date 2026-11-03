x = int(input("Please enter a number: "))
y = input("Please enter an operation: ")
z = int(input("Please enter another number: "))
if y=="-":
    print(str(x)+ " - " + str(z) + " = " + str(x-z))
elif y=="+":
    print(str(x) + " + " + str(z) + " = " + str(x+z))
elif y=="/":
    print(str(x)+ " / " + str(z) + " = " + str(x/z))
elif y=="*":
    print(str(x)+ " * " + str(z) + " = " + str(x*z))
