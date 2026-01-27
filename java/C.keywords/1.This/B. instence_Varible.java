package this_keywod.java;
import java.util.*;
public class instance_Varible
{
 int id;
 String name;
 float per;
 
 public instance_Varible(int id,String name,float per)
 {
	this.id=id;
	this.name=name;
	this.per=per;
 }
 void disp()
 {
	 System.out.println("name:"+name+" id:"+id+" percentage:"+per);
 }
 public static void main(String[] args) 
 {
  instance_Varible ob=new instance_Varible( 4,"Amol", 35);
  ob.disp();
 }
}
