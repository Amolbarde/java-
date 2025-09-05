package this_keywod.java;
public class show 
{
 void show()
 {
	 System.out.println("Hello !! welcome");
 }
 void disp()
 {
	 this.show();
 }
 void disp1()
 {
	 this.disp();
 }
 public static void main(String[] args) 
 {
  show ob=new show();
  ob.disp1();
 }
}
// Hello !! Welcome
