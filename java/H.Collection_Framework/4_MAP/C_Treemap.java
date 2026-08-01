package javaCollections;
import java.util.*;
public class C_Treemap
{
 public static void main(String[] args) 
 {
  // store key-value pair in sorted orderd
	 TreeMap<Integer,String> t = new TreeMap<Integer, String>();
	 t.put(1,"red");
	 t.put(2,"pink");
	 t.put(3,"blue");
	 t.put(4,"orenge");
	 System.out.println(t.get(4));
	 for(Integer a:t.keySet())
	 {
		 System.out.println("key : "+ a+"| value : "+t.get(a));
	 }
 }
}

/*
orenge
key : 1| value : red
key : 2| value : pink
key : 3| value : blue
key : 4| value : orenge
*/
