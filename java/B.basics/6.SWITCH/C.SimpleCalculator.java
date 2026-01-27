import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: +  -  *  /");
        char op = sc.next().charAt(0);

        switch (op) {
           case '+':            System.out.println("Result = " + (a + b));
             break;
          
           case '-':             System.out.println("Result = " + (a - b));
            break;

            case '*':               System.out.println("Result = " + (a * b));
                break;

            case '/':
            if (b != 0)                   System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero not allowed!");
                break;

            default:               System.out.println("Invalid Operator!");
        }

        sc.close();
    }
}