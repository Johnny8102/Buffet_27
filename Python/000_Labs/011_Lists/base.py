import random
thislist = ["Why did the scarecrow win an award? Because he was outstanding in his field.","I used to play piano by ear, but now I use my hands.","Parallel lines have so much in common, it's a shame they'll never meet.","What do you call a fake noodle? An impasta", "Why did the computer show up at work late? It had a hard drive."]
x = int((random.randrange(6)))
if x==0:
    print(thislist[0])
elif x==1:
    print(thislist[1])
elif x==2:
    print(thislist[2])
elif x==3:
    print(thislist[3])
elif x==4:
    print(thislist[4])