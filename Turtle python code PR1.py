#Deadshot Quintus
import turtle
col=('lime' , 'red' , 'yellow' , 'blue' , 'magenta' , 'orange')
t=turtle.Turtle()
screen=turtle.Screen()
screen.bgcolor('black')
t.speed(40)
for i in range(300):
    t.color(col[i%6])
    t.forward(i*1.5)
    t.left(59)
    t.width(3)
    if i<26:
        if i%3==0:
            screen.bgcolor('white')
        else:
            screen.bgcolor('black')
    elif i>=26 and i<74:
        if i%2 ==0:
            screen.bgcolor('white')
        else:
            screen.bgcolor('black')
    else:
        if i%3==0:
            screen.bgcolor('white')
        else:
            screen.bgcolor('black')
            
#spiral created
