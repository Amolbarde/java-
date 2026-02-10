public class 01_introduction 
{
 public static void main(String[] args) 
 {
  String s1 = "hello";
  String s2 = new String("hello");
  System.out.println("String s1 : "+s1);
  System.out.println("String s2 : "+s1);
  System.out.println("Length of s1 "+s1.length());
  System.out.println("Length of s1 "+s2.length());
  if(s1.length()==s2.length())
  {
    System.out.println("lenght is same");
  }
  else
  {
    System.out.println("lenght is not same");
  }
  if(s1.length()%2==0)
  {
    System.out.println("String s1 lenght "+s1.length() + "is even");
  }
  else{
    System.out.println("String s1 lenght "+s1.length() + "is odd");
    
  }
  System.out.println("Character At index 1 :"+s1.charAt(1));
  if(s1==s2)
  {
    System.out.println("same");

  }
  else {
    System.out.println("s1 and s2 are different");
  }
  System.out.println("s1.equals(s2) : "+s1.equals(s2));
      
 }    
}
