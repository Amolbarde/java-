public class immutabil 
{
 public static void main(String[] args)
 {
  String s1 = "java";
  s1.concat(" Programming ");
  System.out.println("After concat without assignment : "+ s1);
  
  String s2 = s1.concat(" Programming");
  System.out.println("Originial string : "+s1);
  System.out.println("new string : "+s2);
  System.out.println("s1==s2 : "+s1==s2);
  
 }    
}
