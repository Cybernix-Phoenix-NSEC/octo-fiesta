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
