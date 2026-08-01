// create class product(pid, pname, price, quantity) accept
// it and display total

package practice;
import java.util.*;
public class product
{
 int pid;
 String name;
 float price;
 float qty;
 float t;
 void accept()
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter product id : ");
	 pid = sc.nextInt();
	 System.out.println("Enter product Name : ");
	 name = sc.next();
	 System.out.println("Enter product price : ");
	 price = sc.nextFloat();
	 System.out.println("Enter product qty : ");
	 qty = sc.nextFloat();
	 
 }

 void cal()
 {
	  t = price*qty;
 }

 void disp()
 {
	 System.out.println("PID : "+pid);
	 System.out.println("NAME : "+name);
	 System.out.println("PRICE : "+price);
	 System.out.println("QUANTITY : "+qty);
	 System.out.println("TOTAL PRICE : "+t);
	 
	 
 }
 
 public static void main(String[] args)
 {
  product p = new product();
  p.accept();
  p.cal();
  p.disp();
 }
}

