* String comparision

1) Adderss compariosn
->
  String s1 = "Amol";
  String s2 = "Amol";
  String s3 = new String("Amol");
  
  System.out.println(a == b); ->true
  System.out.println(a == c); ->flase
  
Because -
* "java" literal -> same Address
* new String() -> heap -> new Address
  
  
2) content comparision
 
  System.out.println(a.equals(c)); -> true
 
 
