package method_overloding;

public class method2
{
	public int add(int a,int b)
	{
		return a+b;
	}
 public int add(int a,int b,int c)
 {
	 return a+b+c;
 }
 public float add(float a,float b)
 {
	 return a+b;
 }
 
 public static void main(String[] args) 
 {
  method2 ob=new method2();
  System.out.println("sum of two number:"+ob.add(11, 100));
  System.out.println("sum of three numbers:"+ob.add(11,44,55));
  System.out.println("sum of two number:"+ob.add(1, 100));
  
 }
}
