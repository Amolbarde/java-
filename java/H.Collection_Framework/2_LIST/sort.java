package javaCollections;
import java.util.*;
public class sort
{
 public static void main(String[] args) 
 {
  ArrayList	<Integer> arr = new ArrayList<Integer>();
  arr.add(5);
  arr.add(4);
  arr.add(3);
  arr.add(2);
  arr.add(1);
 
  System.out.println("befor sort :");
  System.out.println(arr);

  Collections.sort(arr);
  System.out.println("After sort :");
  for(Integer a : arr)
  {
	  System.out.println(a);
  }
 }
}

