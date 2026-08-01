package practice;
import java.util.*;
public class area 
{
 void reactangle(int a, int b)
 {
	 int area = a*b;
	 System.out.println("area of reactangle = "+area);
 } 
 
 void perimeter(int l, int b)
 {
	 int p = 2*(l+b);
	 System.out.println("Perimeter = "+p);
 }
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  int x,y;
  System.out.println("Enyter legth:");
  x = sc.nextInt();
  System.out.println("Enyter breadth:");
  y = sc.nextInt();
  area a = new area();
  a.reactangle(x, y);
  a.perimeter(x, y);
 }
}

