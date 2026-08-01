package javaCollections;
import java.util.*;
public class B_Hashmap2 
{
 public static void main(String[] args) 
 {
  HashMap<String,Integer> h = new HashMap<String, Integer>();
  h.put("om",34);
  h.put("sai",43);
  h.put("ram",44);
  h.put("neha",34);
  h.put("karan",34);
  
  for(String i : h.keySet())
  {
	  System.out.println("keys: "+i+" | Value: "+h.get(i));
  }
 }
}

//OUTPUT

/*
keys: neha | Value: 34
keys: karan | Value: 34
keys: sai | Value: 43
keys: om | Value: 34
keys: ram | Value: 44
*/
