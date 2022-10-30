import java.io.*;
import java.util.*;

class Node {
int data;
Node next;

Node(int d)
{
data =d;
next=null;
}

}


class llist {

static Node head=null;

public static void main(String args[])
{
add(7);
add(10);
add(0);
add(78);



display();
System.out.println(count());
delete(3);
add(9,3);
add(950,0);
display();
}


static void display()
{

Node temp=head;

while(temp!=null)
{
System.out.print(temp.data+" ");
temp=temp.next;
}
System.out.println();
}


static void add(int d) 
{

if(head==null)
{
head=new Node(d);
return;
}

Node temp=head;

while(temp.next!=null)
{
temp = temp.next;
}

temp.next=new Node(d);
}


static void add(int d, int pos)
{

if(pos==0)
{
Node temp=new Node(d);
temp.next=head;
head=temp;
return;
}

Node temp=head;

int c=1;

while(c<pos)
{
temp=temp.next;
c++;
}

Node t=new Node(d);

t.next=temp.next;
temp.next=t;


}
 

static void delete(int pos)
{
if(head==null)
return;

Node temp=head;
int c=1;
while(c<pos)
{
c++;
temp = temp.next;
}

temp.next=temp.next.next;
}



static int count()
{
if(head==null)
return 0;

Node temp=head;
int c=1;
while(temp.next!=null)
{
c++;
temp = temp.next;
}

return c;
}

}

