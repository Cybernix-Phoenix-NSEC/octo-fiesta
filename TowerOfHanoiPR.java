//We have to move n discs from A to C using B
import java.util.*;
class TowerOfHanoiPR
{
  public static void manage(int n, String first , String middle , String last)
  {
    if(n==0)
      return;
    else
    {
      manage(n-1 , first , last , middle);
      System.out.println("Disc is moved from  " + first +" to "+ last);
      manage(n-1 , middle , first , last);
    }
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of discs : ");
    int ndiscs=in.nextInt();
    manage(ndiscs , "A" , "B" , "C"); 
  }
}
