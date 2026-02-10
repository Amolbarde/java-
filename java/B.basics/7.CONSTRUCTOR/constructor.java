
import java.util.*;
class Emp
{
    int eno;
    String nm;
    float sal;
    
    Emp()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter emp id=");
       int id=sc.nextInt();
          System.out.println("enter emp id=");
        nm=sc.next();
          System.out.println("enter emp id=");
       float sal=sc.nextFloat();
        System.out.println(" emp id="+id);
        System.out.println(" emp name="+nm);
        System.out.println(" emp sal="+sal);
    }
}
class constructor
{
    public static void main(String abc[])
    {
        Emp ob=new Emp();
    }
}