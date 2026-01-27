class A
{
 String name="INDIA";
 int code=153952;
 void a()
 {
	 
 }
}
class B extends A
{
 void show()
 {
	 System.out.println(super.name+" is beautyful country in All world");
	System.out.println("Country code is:"+super.code); 
 }
}
class demo
{
 public static void main(String[] args) 
 {
   B ob=new B();
   ob.show();
}	
}

// INDIA is beautyful country in All world
// Country code is:153952
