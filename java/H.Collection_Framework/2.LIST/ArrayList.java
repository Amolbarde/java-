package javaCollections;
import java.util.*;
public class ArrayList
{
 public static void main(String[] args)
 {
  ArrayList<String> a = new ArrayList<String>();
  a.add("A");
  a.add("papu");
  a.add("33");
  System.out.println(a);
  a.remove(2);
  System.out.println(a);
  a.set(1,"Amol");
  System.out.println(a);
  
  
  System.out.println("size ="+a.size());

  System.out.println("simple way");
  System.out.println(a);
  
  System.out.println("print using loop");
  for(int i = 0;i<a.size();i++)
  {
   System.out.println(a.get(i));
  }
  }
}

