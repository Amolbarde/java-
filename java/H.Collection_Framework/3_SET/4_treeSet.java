package javaCollections;
import java.util.*;
public class D_treeSet
{
 public static void main(String[] args) 
 {
  //store unique element in sorted order	
  //unlike hashset, which has no order , TreeSet keeps its element sorted automatically.
  
  TreeSet<String> t = new TreeSet<String>();
  t.add("d");
  t.add("c");
  t.add("b");
  t.add("a");
  System.out.println(t);
  
  //output [a, b, c, d]
 }
}

