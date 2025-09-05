package inheritance.java;
 class A1
{
 void show()
 {
	 System.out.println("I am parent class");
 }
}
 class B extends A1
{
 void print()
 {
	 System.out.println("I am child class");
 }
}
 class A
 {
 public static void main(String[] args) 
 {
	B ob=new B();
	ob.show();
	ob.print();
} 
}
// I am parent class
// I am child class
