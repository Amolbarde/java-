class Mobile
{
    String brand;
    int volume;

    Mobile()
    {
        brand = "vivo";
        volume = 10;
    }
}
public class default_constructor2
 {
    public static void main(String[] args)
     {
      Mobile m = new Mobile();
      System.out.println(m.brand);
      System.out.println(m.volume);    
    }    
}
