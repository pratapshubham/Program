import java.io.*;
import java.util.*;
public class Week
{
public static void main(String args[])
{
       String day ;
       System.out.println();
       Scanner sc = new Scanner(System.in);
       day = sc.nextLine();
       if(day.equals("sunday") || day.equals("saturday")||day.equals("Sunday") || day.equals("Saturday"))
       {
       System.out.print("yes");
       }else
       {
       System.out.print("no");
       }
}
}