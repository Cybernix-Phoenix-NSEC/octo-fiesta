import turtle as t

s=t.Screen()
s.bgcolor("black")
c=t.clone()
k=t.clone()


t.speed(0)

def shape (angle,side,lim):
    rev_dir = 5
    t.forward(side)

    if side % (rev_dir*2) == 0:
        angle = angle +0.4
        t.pencolor("white")
        t.pensize(4)
        s.bgcolor("white")
    else:
        angle = angle +0.2
        t.pencolor("silver")
        t.pensize(2)
        s.bgcolor("black")
        
        
    t.right(angle)
    side = side + 2
    if side < lim:
        shape(angle,side,lim)
    col=('black' , 'gold' , 'black' , 'gold' , 'black' , 'gold')
    
    t.speed(0)
    t.pensize(3)
    for i in range(200):
       c.color(col[i%6])
       c.forward(i*1.5)
       c.left(59)
       c.width(3)
       if i<26:
           if i%3==0:
            s.bgcolor('white')
           else:
            s.bgcolor('black')
       elif i>=26 and i<74:
            if i%2 ==0:
                s.bgcolor('white')
            else:
                s.bgcolor('black')
       else:
            if i%3==0:
                s.bgcolor('white')
            else:
                s.bgcolor('black')
   
    k.pen(pencolor="cyan",pensize=7,speed=7)
    k.penup()
    k.goto(240,-200)
    k.pendown()
    k.goto(240,-300)
    k.goto(300,-250)
    k.goto(240,-200)
    k.penup()
    k.goto(360,-200)
    k.pendown()
    k.goto(320,-250)
    k.goto(360,-300)
    k.goto(400,-250)
    k.goto(360,-200)
    k.penup()
    k.goto(360,-250)
    k.pendown()
    k.goto(400,-300)
    t.done()


        

angle = 120
side = 0
lim = 800
shape(angle,side,lim)
