import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="square" width=1200 height =560>
</applet>
*/


public class square extends Applet implements Runnable,ActionListener
{
int sp=10;
int z=0,ofs=160;
Thread t;
Button p;
Graphics g;
Image img;
Label coff;
String msg="4/PI";
int n=0;

Color c[]=new Color[10];
int xa[]=new int[10];
int ya[]=new int[10];
double ra[]=new double[10];

public void init()
{
coff=new Label("Fourier Coefficients : ");


coff.setBackground(Color.BLACK);

add(coff);
System.out.println(msg);
p=new Button("ADD HARMONICS");

p.setBackground(Color.RED);
add(p);

p.addActionListener(this);

c[0]=new Color(208,205,145);
c[1]=new Color(197,249,254);
c[2]=new Color(57,182,230);
c[3]=new Color(237,112,184);
c[4]=new Color(137,211,139);
c[5]=new Color(129,200,220);
c[6]=new Color(211,152,224);
c[7]=new Color(156,213,243);
c[8]=new Color(156,213,243);
c[9]=new Color(221,255,196);



coff.setForeground(c[0]);

setBackground(Color.BLACK);

t = new Thread(this);
t.start();

for(int i=0;i<n;i++)
ra[i]=r/(2*i+1);

img=createImage(1200,560);
g=img.getGraphics();

}



public void actionPerformed(ActionEvent ae)
{
n=(n+1)%10;
//sp-=1;
for(int i=0;i<n;i++)
{
ra[i]=r/(2*i+1);
xa[i]=0;
ya[i]=0;
z=0;
}
g.clearRect(0,0,1200,560);
theta=0;
msg+=" + sin("+(2*n-1)+"*theta)/"+(2*n-1);
repaint();
}



double r=80.0;
double theta=0;



public void run()
{

try
{
for(theta=0;theta>=0;theta-=1.5)
{

for(int j=0;j<n;j++)
{
xa[j]=(int)(ra[j]*Math.cos(Math.toRadians((2*j+1)*theta)));
ya[j]=(int)(ra[j]*Math.sin(Math.toRadians((2*j+1)*theta)));
}


z++;
t.sleep(sp);

repaint();

if(theta<=0)
theta=360;
}
}

catch(Exception e){};
}




public void paint(Graphics k)
{
p.setLocation(500,500);
coff.setLocation(10,400);



int xs=0,ys=0;


g.clearRect(0,0,320,300);


for(int i=0;i<n;i++)
{
g.setColor(c[i]);
int t=(int)ra[i];
g.drawOval(ofs-t+xs,ofs-t+ys,t*2,t*2);
g.drawLine(ofs+xs,ofs+ys,ofs+xs+xa[i],ofs+ys+ya[i]); 
xs+=xa[i];
ys+=ya[i];
}



g.setColor(c[0]);
g.fillRect(ofs+200+z,ofs-1+ys,1,1);

g.drawString(msg,140,417);
k.drawImage(img,0,0,this);

k.setColor(new Color(208,205,145));
k.drawLine(ofs+xs,ofs+ys,ofs+200+z,ofs+ys);



}


public void update(Graphics g)
{
paint(g);
}

}






 