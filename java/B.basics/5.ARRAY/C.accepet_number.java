package array.java;
import java.util.*;
public class Demo 
{
 public static void main(String[] args) 
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter limit");
  int n=sc.nextInt();
  
  int a[]=new int[n];
  System.out.println("Enter n element");
  for(int i=0;i<n;i++)
  {
	  a[i]=sc.nextInt();
  }
  System.out.println("numbers are:");
  for(int i=0;i<n;i++)
  {
	  System.out.println(a[i]);
  }
 }
}
