package bank;
import java.util.*;
public class bank
{
 private double balance = 1000;
 public void deposite(double amt)
 {
	 if(amt>2000)
	 {
		 System.out.println("deposite limit is 1000!!!");
		 System.exit(0);
	 }
	 if(amt>0)
	 {
		 balance = balance+amt;
	 }
	 
 }
 
 public void withdraw(double amt)
 {
	 if(amt>0 && amt<=balance)
	 {
		 balance-=amt;
	 }
	 else
	 {
		 System.out.println("invalid withdraw!!");
	 }
 }
 
 void bal()
 {
	 System.out.println("Avalible balance:"+balance);
 }
 
 public static void main(String[] args) 
 {
  bank b = new bank();
  b.deposite(3000);
  b.bal();
  b.withdraw(500000);
  b.bal();
}
}


