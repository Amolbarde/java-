public class AllOperators
 {
    public static void main(String[] args) 
{
       int a = 10, b = 3;
       // Arithmetic Operators
      System.out.println("Arithmetic
Operators:");
     System.out.println("a + b = " + (a + b));
     System.out.println("a - b = " + (a - b));
     System.out.println("a * b = " + (a * b));
      System.out.println("a / b = " + (a / b));
      System.out.println("a % b = " + (a % b));
      System.out.println();

        //Relational Operators                              System.out.println("Relational Operators:");
System.out.println("a > b = " + (a >    b));
System.out.println("a < b = " + (a < b));
System.out.println("a >= b = " + (a >= b));
System.out.println("a <= b = " + (a <= b));
System.out.println("a == b = " + (a == b));
System.out.println("a != b = " + (a != b));
 System.out.println();

        // Logical Operators
       
        boolean x = true, y = false;
        System.out.println("Logical     Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));
        System.out.println();

        // Assignment Operators
            System.out.println("Assignment Operators:");
        int c = a; System.out.println("c = " + c);
        c += 5;
System.out.println("c += 5 -> " + c);
        c -= 2;
System.out.println("c -= 2 -> " + c);
        c *= 3;
System.out.println("c *= 3 -> " + c);
        c /= 4;
System.out.println("c /= 4 -> " + c);
        c %= 2;
System.out.println("c %= 2 -> " + c);
System.out.println();

        // Unary Operators
      
 System.out.println("Unary Operators:");
        int u = 5;
        System.out.println("u = " + u);
        System.out.println("++u = " + (++u)); // pre-increment
        System.out.println("u++ = " + (u++)); // post-increment
        System.out.println("After u++ = " + u);
        System.out.println("--u = " + (--u)); // pre-decrement
        System.out.println("u-- = " + (u--)); // post-decrement
        System.out.println("After u-- = " + u);
        System.out.println("-u = " + (-u));   // negation
        System.out.println();

        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        int m = 6, n = 4; // 6 = 110, 4 = 100
        System.out.println("m & n = " + (m & n)); // AND
        System.out.println("m | n = " + (m | n)); // OR
        System.out.println("m ^ n = " + (m ^ n)); // XOR
        System.out.println("~m = " + (~m));       // NOT
        System.out.println("m << 1 = " + (m << 1)); // Left shift
        System.out.println("m >> 1 = " + (m >> 1)); // Right shift
        System.out.println();

        // Ternary Operator
        System.out.println("Ternary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = " + max);
    }
}