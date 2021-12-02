package firstpackage;

public class  Variable_Type
{
public static void main(String[] args) 
	{
		Short a = 3290; // -32768 to 32767 
		String a_1= "Java Programming";
		String z = "Null";
		System.out.println("z :" + z);
		System.out.println("a_1 :" + a_1);
		System.out.println("a : " + a);
		float pi =  3.14_15F; //3.142142
		System.out.println("pi : " + pi);
		double d = 3.2345678d;
		boolean s =true;
		System.out.println(pi);
		System.out.println(s);
		
		int p =2; // Java doesn't support dynamic type & re-initialization
		int q = 9;
		int r = p+q; // Binary operator
		int t = r%2;
		System.out.println("t :" + t);
		System.out.println("p+q :" + r);
		System.out.println("r : " +(p+q));
		
	}
}
