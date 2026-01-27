package inheritance.java;
import java.util.*;
class Person
{
	String nm;
	int age;
	Scanner sc=new Scanner(System.in);
	void accpet()
	{
		System.out.println("Enter name");
		nm=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		
	}
	void disp()
	{
		System.out.println("name:"+nm);
		System.out.println("age:"+age);
	    
	}
}
class employee extends Person
{
	int sal;
	
	void accpet1()
  	{
  		System.out.println("Enter salary:");
  	    sal=sc.nextInt();
  	}
  	void disp1()
  	{
  		System.out.println("sal:"+sal);
  	}
}
public class Demo 
{
 public static void main(String[] args) 
 {
	employee e=new employee();
	e.accpet();
	e.accpet1();
	e.disp();
	e.disp1();
 }
}
