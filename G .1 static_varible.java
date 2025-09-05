package static_Keyowrd.java;

public class static_varible
{
  int a=10;
 void show()
 {
	 a++;
	 System.out.println("val of a:"+a);
 }
 public static void main(String[] args) 
 {
  static_varible ob=new static_varible();
  ob.show();
  ob.show();
  ob.show();
 }
}
// auto increment 
// val of a:11
// val of a:12
// val of a:13
