package method_overloding;
import java.util.*;
public class Method 
{
  void add(int a,int b)
  {
	  System.out.println("Addition="+(a+b));
  }
  void add(int a,float b)
  {
	  System.out.println("Addition="+(a+b));
  }
  void add(double a,double b)
  {
	  System.out.println("Addition="+(a+b));
  }
  public static void main(String[] args)
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a:");
	 int a=sc.nextInt();
	 System.out.println("Enter b:");
	 int b=sc.nextInt();
	 
	 Method ob=new Method();
	 ob.add(a, b);
	 ob.add(a, b);
	 ob.add(a, b);
  }
}
