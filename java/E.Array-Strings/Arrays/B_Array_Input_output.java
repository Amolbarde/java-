import java.util.*;

public class Array_Input_output 
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Array Size:");
  int size = sc.nextInt();
  int arr[] = new int[size];
  System.out.println("Enter Array Elements:");
  for(int i = 0; i < arr.length; i++)
    {
        arr[i] = sc.nextInt();
    }   
    System.out.println("Array Element are:");
    for(int i = 0; i < arr.length; i++)
    {
        System.out.println(arr[i]);
    }
 }    
}
