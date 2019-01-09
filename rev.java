import java.io.*;
import java.util.*;
public class rev
{
public static void main(String args[])
{
      String str;
       Scanner sc = new Scanner(System.in);
       str = sc.nextLine();
       StringBuffer sb = new StringBuffer(str);
       System.out.println(sb.reverse().toString());
}
}