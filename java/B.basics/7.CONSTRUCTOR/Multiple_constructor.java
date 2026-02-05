class emp{
    int id;
    String name;

    emp()
    {
        id =0;
        name = "abc";
    }
    emp(int i, String n)
    {
        id = i;
        name = n;
    }
}
public class Multiple_constructor 
 {
   public static void main(String[] args) 
   {
    emp e1 = new emp(); 
    System.out.println(e1.id + " " + e1.name);
    emp e2 = new emp(101,"Akashy");
    System.out.println(e2.id + " " + e2.name);
   }   
}
