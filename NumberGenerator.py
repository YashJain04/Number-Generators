# Number Generator Using Python
# Author: Yash Jain
# Date: 2021-02-19

# import python library
import random

# import boolean varaible for repeating the program
repeatProgram = True

while repeatProgram == True:
    # variables asking for user input
    num1 = int(input("From which number do you want to start generating numbers? (Integer Values Only).  "))
    num2 = int(input("To which number do you want to stop generating numbers? (Integer Values Only).  "))

    # use random.randRnage to generate a number from "num1" to "num2"
    randomNumber = random.randrange(num1, num2)

    # print
    print(randomNumber)

    # ask user if they want to repeat the program
    repeat = str(input("\n" + "Do you want to repeat the program?  "))
    repeat = repeat.lower()

    if (repeat == ("yes") or repeat == str("y")):
        repeatProgram = True
        print("")

    else:
        repeatProgram = False

while repeatProgram == False:
    print("\n" + "The program has been terminated!")
    repeatProgram = True

