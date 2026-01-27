public class AllVariables {
    public static void main(String[] args) {
        // ---- Primitive Data Types
        byte b = 100;    // 1 byte
        short s = 3000;  //2 bytes
        int i = 100000;  // 4 bytes
        long l = 10000000000L;    // 8 bytes (L is required)
         float f =3.14f;  // 4 bytes (f is required)
        double d = 99.9999; // 8 bytes
         char c ='A'; // 2 bytes (single character)
        boolean flag = true; // 1 bit (true/false)

    // ---- Non-Primitive(Reference) 
    
 String name = "Akshay";
// sequence of characters (object)
        
        // ---- Output ----
  System.out.println("Byte: " + b);
  System.out.println("Short: " + s);
  System.out.println("Int: " + i);
  System.out.println("Long: " + l);
  System.out.println("Float: " + f);
  System.out.println("Double: "+ d);
  System.out.println("Char: " + c);
  System.out.println("Boolean:"+ flag);
  System.out.println("String: " + name);
    }
}