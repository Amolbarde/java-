class Animal
{
 void dog()
 {
	 System.out.println("Dog is not wild animal");
 }
 void fox()
 {
	 System.out.println("Fox is wild animal");
 }
}
class show extends Animal
{
	void show1()
	{
		super.dog();
		super.fox();
	}
}
class show2 extends show
{
 show2()
 {
	super.show1();
 }
}
public class Main 
{
 public static void main(String abc[])
 {
	 show2 s=new show2();
 }
}

// Dog is not wild animal
// Fox is wild animal

  
