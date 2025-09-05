package static_Keyowrd.java;
public class static_method 
{
 static void welcome(String abc)
 {
	 System.out.println("Welcome "+abc+" !!!");
 }
 public static void main(String[] args) 
 {
  static_method ob=new static_method();
  welcome("Amol");   //direct caling
  static_method.welcome("ram"); //with className.methodName
  ob.welcome("Sham");          // with object.methodName
 }
}
