import java.util.*;
public class PAL
{

	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	String s;
	
	s=scan.nextLine();
	StringBuffer sb=new StringBuffer(s);
	String s1=sb.reverse().toString();
	if(s1.equals(s)){
	
		System.out.print("YES");
		}
	else{
		System.out.print("NO");
	    }
	
	}

}