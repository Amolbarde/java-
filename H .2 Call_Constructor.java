package this_keywod.java;

public class Main 
{
 String name;
 int age;
 Main()
 {
	 this("Unknown",0);
 }
 Main(String name,int age)
 {
	 this.name=name;
	 this.age=age;
 }
 void disp()
 {
	 System.out.println(name+" - "+age);
 }
	public static void main(String[] args) 
	{
	Main ob=new Main();
	 Main ob1=new Main("Akshy",22);
	 ob.disp();
	 ob1.disp();
	}
}
