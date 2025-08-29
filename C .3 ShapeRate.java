import java.util.Scanner;

public class ShapeRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Shape Name (Circle / Square / Rectangle / Triangle): ");
        String shape = sc.nextLine().toLowerCase();

        int rate;

        if (shape.equals("circle")) {
            rate = 100;
            System.out.println("Shape: Circle, Rate = " + rate);
        } 
        else if (shape.equals("square")) {
            rate = 150;
            System.out.println("Shape: Square, Rate = " + rate);
        } 
        else if (shape.equals("rectangle")) {
            rate = 200;
            System.out.println("Shape: Rectangle, Rate = " + rate);
        } 
        else if (shape.equals("triangle")) {
            rate = 120;
            System.out.println("Shape: Triangle, Rate = " + rate);
        } 
        else {
            System.out.println("Invalid Shape Entered!");
        }

        sc.close();
    }
}