class student
{
    int rno;
    String name;

    student(int r, String n)
    {
        rno = r;
        name = n;
    }
}
public class Parameterized 
{
 public static void main(String[] args) 
 {
  student ob = new student(101, "Akashy");   
  System.out.println(ob.rno);
  System.out.println(ob.name);
 }    
}
