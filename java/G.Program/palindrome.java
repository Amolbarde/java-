package palindrome.java;
import java.util.*;
public class Palindrome 
{
 public static void main(String abc[])
 {
	 Scanner sc=new Scanner(System.in);
	 int num,original,reverse=0,reminder;
	 System.out.println("Enter number:");
	 num=sc.nextInt();
	 original=num;
	 while(num!=0)
	 {
		 reminder=num%10;  //last digit
		 reverse=reverse*10+reminder; //reverse in add
		 num=num/10;     // number make short
	 }
	 if(original==reverse)
	 {
		 System.out.println(original+" palindrome");
	 }
	 else
	 {
		 System.out.println(original+" not palindrome");
	 }
 }
}
