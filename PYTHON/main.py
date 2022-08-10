import random

def computer_Choice():
    a=("Stone","Paper","Sessor")
    item=random.choice(a)
    return item

def player_choice():
    ch={1:"Stone",2:"Paper",3:"Sessor"}
    print("Choice : ",ch)
    choice=int(input("Enter your choice : "))
    val=ch.get(choice)
    return val

def dicission(computer,player,computerPoint,playerPont):
    if computer == player :
        print("Computer choice = ",computer)
        print("Player choice = ",player)
        print("Both are same choice  :) ")

    elif computer=="Stone" and player=="Paper":
        print("Computer choice = ",computer)
        print("Player choice = ",player)
        print("Player  +1")
        playerPont+=1

    elif computer=="Paper" and player=="Sessor":
        print("Computer choice = ",computer)
        print("Player choice = ",player)
        print("Player  +1")
        playerPont+=1

    elif computer=="Sessor" and player=="Stone":
        print("Computer choice = ",computer)
        print("Player choice = ",player)
        print("Player  +1")
        playerPont+=1

    elif computer=="Sessor" and player=="Paper":
        print("Computer choice = ",computer)
        print("Player choice = ",player)
        print(":) Computer  +1")
        computerPoint+=1

    elif computer=="Paper" and player=="Stone":
        print("Computer choice = ",computer)
        print("Player choice = ",player)
        print(":) Computer  +1")
        computerPoint+=1

    elif computer=="Stone" and player=="Sessor":
        print("Computer choice = ",computer)
        print("Player choice = ",player)
        print(":) Computer  +1")
        computerPoint+=1

    else:
        print("Please enter correct number....")
    
    return computerPoint,playerPont


computerPoint=0
playerPont=0
for i in range(3):
    computerPoint,playerPont = dicission(computer_Choice(),player_choice(),computerPoint,playerPont)
    print("*"*30)

if computerPoint == playerPont :
    print("Total point are same !")
elif computerPoint > playerPont :
    print(f":) Computer won this match | Computer total point = {computerPoint} | Player total point = {playerPont}")
elif computerPoint < playerPont :
    print(f":) Player won this match | Computer total point = {computerPoint} | Player total point = {playerPont}")

