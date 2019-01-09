import java.io.*;
import java.util.*;
public class KTH
{
public static void main(String args[])
{
     int number,i,k;
       Scanner sc = new Scanner(System.in);
       number = sc.nextInt();
       int temp = 0;
       int []a = new int[number];
       int []b = new int[number];
       for( i=0;i<number;i++)
       {
       a[i]=sc.nextInt();
       }
       Arrays.sort(a);
       for( i=number-1;i>=0;i--)
       {
       b[temp] = a[i];
       temp++;
       }
       k = sc.nextInt();
       System.out.println(b[k]);
}
}