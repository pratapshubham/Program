import java.util.*;
public class H
{

  
   public static void main(String []args)
{

 int n;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
if(n > 0)
{
System.out.println("Positive");
}     
else if(n < 0)
{
System.out.println("Negative");
}
else
{
System.out.println("Zero");
}
}
}