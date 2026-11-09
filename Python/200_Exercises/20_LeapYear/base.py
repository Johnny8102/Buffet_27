x = int(input("please enter a year you'd like to check "))
if x%4==0:
    print("the year " + str(x) + " is a leap year")
elif year % 100 == 0 and year % 400 != 0:
    print("the year " + str(x) + " is not a leap year")
else:
    print("the year " + str(x) + " is not a leap year")