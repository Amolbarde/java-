import java.util.Scanner;

class C_Max_Min{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume first element as max and min
        int max = arr[0];
        int min = arr[0];

        // Find max and min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Output
        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
    }
}