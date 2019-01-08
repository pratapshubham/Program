import java.util.*;
public class Fact
 {    
    public static void main(String[] args) 
{
        
       int n,i,f=1;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
	for(i=1;i<=n;i++)
	{
	f = f * i;
	}
	System.out.print(f);
    }
    
}