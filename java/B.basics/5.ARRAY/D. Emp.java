package array.java;
import java.util.*;
public class Emp 
{
 int no;
 String name;
 double sal;
 
 Emp(int no,String name,double sal)
 {
	 this.no=no;
	 this.name=name;
	 this.sal=sal;
 }
 void disp()
 {
	 System.out.println("number:"+no+"\n"+"Name:"+name+"\n"+"salary:"+sal);
 }
  
 public static void main(String[] args) 
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter limit");
  int n=sc.nextInt();
  Emp[] employee=new Emp[n];
  for(int i=0;i<n;i++)
  {
	  System.out.println("\n Enter details of employee"+(i+1));
	  System.out.println("Enter no:");
	  int no=sc.nextInt();
	  System.out.println("Enter name:");
	  String name=sc.next();
	  System.out.println("Enter salary:");
	  double sal=sc.nextDouble();
	  employee[i]=new Emp(no, name, sal);
  }
  System.out.println("\n Employee details-----");
  for(Emp disp:employee)
  {
	  disp.disp();
  }
  sc.close();
 }
}
