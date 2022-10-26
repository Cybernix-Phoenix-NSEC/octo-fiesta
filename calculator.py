from replit import clear
#For Clearing outputs
logo = """
 _____________________
|  _________________  |
| | Pythonista   0. | |  .----------------.  .----------------.  .----------------.  .----------------. 
| |_________________| | | .--------------. || .--------------. || .--------------. || .--------------. |
|  ___ ___ ___   ___  | | |     ______   | || |      __      | || |   _____      | || |     ______   | |
| | 7 | 8 | 9 | | + | | | |   .' ___  |  | || |     /  \     | || |  |_   _|     | || |   .' ___  |  | |
| |___|___|___| |___| | | |  / .'   \_|  | || |    / /\ \    | || |    | |       | || |  / .'   \_|  | |
| | 4 | 5 | 6 | | - | | | |  | |         | || |   / ____ \   | || |    | |   _   | || |  | |         | |
| |___|___|___| |___| | | |  \ `.___.'\  | || | _/ /    \ \_ | || |   _| |__/ |  | || |  \ `.___.'\  | |
| | 1 | 2 | 3 | | x | | | |   `._____.'  | || ||____|  |____|| || |  |________|  | || |   `._____.'  | |
| |___|___|___| |___| | | |              | || |              | || |              | || |              | |
| | . | 0 | = | | / | | | '--------------' || '--------------' || '--------------' || '--------------' |
| |___|___|___| |___| |  '----------------'  '----------------'  '----------------'  '----------------' 
|_____________________|
"""

print(logo)

# Calculation part
def calc(a, b, op):
    if (op == "+"):
        return (a + b)
    elif (op == "-"):
        return (a - b)
    elif (op == "*"):
        return (a * b)
    elif (op == "/"):
        return (a / b)

# Main Program
flag = 0
should_continue = True
# While loop for Repeating Calculation
while (should_continue):
    if (flag == 0):
        number_1 = float(input("What's the first number : "))
    flag=0 #almost like backtracking but just to omit re-input
    print("+\n-\n*\n/\n")  #operators print
    op = input("Pick an operator from above : ")
    number_2 = float(input("What's the next number : "))
    print(f"{number_1} {op} {number_2} : {calc(number_1,number_2,op)}")
    result = input(
        f"type 'y' to continue calculating with {calc(number_1,number_2,op)}, or type 'n' to start a new calculation, or type 'exit' for exit calculator "
    )
    if (result == "exit"):                #For exit from the Program
        should_continue = False
        print("Goodbye")
        break
    elif (result == "y"):                #For calculating with same Inputs
        flag = 1
        number_1 = int(calc(number_1, number_2, op))
    else:                                #For starting the program from first step
        clear()
