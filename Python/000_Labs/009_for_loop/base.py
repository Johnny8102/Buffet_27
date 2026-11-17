x = int(input("please enter line length "))
vh = input("horizontal or vertical ")
if vh == "horizontal":
   for count in range (0,x):
        print("_", end="")
        
if vh == "vertical":
    for count in range (0,x):
        print("|")    
        
