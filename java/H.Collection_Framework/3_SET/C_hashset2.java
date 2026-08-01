package javaCollections;
import java.util.*;
public class hashset2
{
 public static void main(String[] args) 
 {
  HashSet<String> h = new HashSet<String>();
  h.add("pune");
  h.add("delhi");
  h.add("goa");
  h.add("pune");
  
  if(h.contains("pune"))
  {
	  System.out.println("found city..");
	  h.remove("pune");
  }
  else
  {
	  System.out.println("Not found city..");
  }
  
  for(String h1 : h)
  {
	  System.out.println(h1);
  }
 }
}

