import turtle as t


t.bgcolor("black")
c=t.clone()
k=t.clone()


t.speed(0)
c.speed(0)
c.pensize(20)
c.penup()
c.goto(0,-300)
c.pendown()
c.pencolor("cyan")
c.circle(320)

def shape (angle,side,lim):
    rev_dir = 5
    t.forward(side)

    if side % (rev_dir*2) == 0:
        angle = angle +0.4
        t.pencolor("white")
        t.pensize(3)
        t.bgcolor("black")
    else:
        angle = angle +0.2
        t.pencolor("silver")
        t.pensize(1)
        t.bgcolor("black")
        
        
    t.right(angle)
    side = side + 2
    if side < lim:
        shape(angle,side,lim)
    
   
    k.pen(pencolor="cyan",pensize=7,speed=7)
    k.penup() # d upper
    k.goto(360,-200)
    k.pendown() #d down
    k.goto(360,-300)
    k.goto(420,-250)
    k.goto(360,-200)
    k.penup()
    k.goto(480,-200)
    k.pendown()
    k.goto(440,-250)
    k.goto(480,-300)
    k.goto(520,-250)
    k.goto(480,-200)
    k.penup()
    k.goto(480,-250)
    k.pendown()
    k.goto(520,-300)
    t.done()


        

angle = 120
side = 0
lim = 800
shape(angle,side,lim)

