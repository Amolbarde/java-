package this_keywod.java;
import java.util.*;
public class Emp 
{
 String nm; 
 int age;
 double sal;
  
 Emp(String nm,int age,double sal)
 {
	 this.nm=nm;
	 this.age=age;
	 this.sal=sal;
 }
 Emp(String nm,int age)
 {
	 this(nm,age,3000);
 }
 Emp()
 {
	 this("Unknown",0);
 }
 void disp()
 {
	 System.out.println("name:"+nm);
	 System.out.println("age:"+age);
	 System.out.println("salary:"+sal);
	 
 }
 
 void show()
 {
	 this.disp();
 }
 public static void main(String[] args) 
 {
  Emp ob=new Emp("Akashy",1,55555);
  ob.show();
  Emp ob1=new Emp("sai",2);
  ob1.show();
  Emp ob3=new Emp();
  ob3.show();
 }
}
