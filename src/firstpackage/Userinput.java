package firstpackage;
import java.util.*;
class Userinput
{

	public static void main(String[] args) 
	{
	 Scanner scan = new Scanner(System.in); // accept input from keyboard
	 System.out.println("enter user input");
	 String m = scan.nextLine();
	 String n = scan.nextLine();
	 System.out.println(m);
	 System.out.println(n);
	 System.out.println(m+n); // + operator will perform concatenation with string
	 System.out.print(n+m);// + operator will perform concatenation with string
	 }

}