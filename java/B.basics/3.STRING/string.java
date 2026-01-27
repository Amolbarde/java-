public class AllStrings {
    public static void main(String[] args)
 {

   // ---- 1. String Creation ----
  String s1 ="Hello";  
  String s2 =new
  String("World");   
  System.out.println("s1: " + s1);
  System.out.println("s2: " + s2);
  System.out.println();

 // ----2.Common String Methods ----
 
 String str = " Java Programming ";
 System.out.println("Original: [" + str + "]");

 System.out.println("Length: " + str.length());
 
System.out.println("Uppercase: " + str.toUpperCase());

System.out.println("Lowercase: " + str.toLowerCase());

System.out.println("Trim: [" + str.trim() + "]");
        System.out.println("Substring(0,4): " + str.substring(0,4));
        System.out.println("CharAt(2): " + str.charAt(2));
        
System.out.println("Contains 'Pro'? " + str.contains("Pro"));
        
System.out.println("Replace Java → C++: " + str.replace("Java", "C++"));
System.out.println();

//----3.String Comparison ----
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
 
System.out.println("a == b ? " + (a == b));         // true (same pool)
       
 System.out.println("a == c ? " + (a == c));         // false (different object)
        System.out.println("a.equals(c) ? " + a.equals(c)); // true (value compare)
        
System.out.println();

// ---- 4. Mutable Strings ----
        
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World"); // modifies same object
        System.out.println("StringBuffer: " + sb);

StringBuilder sb2 = new StringBuilder("Java");
sb2.append(" Rocks"); // modifies same object
        System.out.println("StringBuilder: " + sb2);
    }
}