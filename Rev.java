import java.util.*;
public class Rev
 {    
    public static void main(String[] args) 
{
        
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        char array[] = a.toCharArray();
        int len = array.length;
        for(int i = len-1;i>=0;i--)
        {
        System.out.print(array[i]);
        }
    }
    
}