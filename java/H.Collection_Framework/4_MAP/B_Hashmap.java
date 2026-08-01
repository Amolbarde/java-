package javaCollections;
import java.util.*;
public class B_Hashmap
{
 public static void main(String[] args) 
 {
	HashMap<Integer, String> h = new HashMap<Integer, String>();
	h.put(4, "Amol");
	h.put(2,"om");
	h.put(3, "karan");
	h.put(null, "Neha");
	System.out.println(h);
	
	//OUTPUT {null=Neha, 2=om, 3=karan, 4=Amol}
	//sort 
	
	if(h.get(2) == "om")
	{
	 System.out.println("name is OM");	
	}
	else
	{
		System.out.println("not found..");
	}
 }
}

