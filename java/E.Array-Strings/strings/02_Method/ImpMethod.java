public class ImpMethod 
{
 public static void main(String[] args) 
 {
  String s = "java Programming by Amol";
  
  //1) length
  System.out.println("length : "+ s.length());

  //2) charAt
  System.out.println("Character at index 2 : "+ s.charAt(2));

  //3) trim
  System.out.println("Trimmed : "+ s.trim());

  //4) toUpperCase()
  System.out.println("Upper Case String : "+ s.toUpperCase());

//5) toLowerCase()
  System.out.println("lower Case String : "+ s.toLowerCase());

//6) Substrig
  System.out.println("sub string at(0 to 3) : "+ s.substring(0,5));

//7) contain()
  System.out.println("Contains Amol : "+ s.contains("Amol"));

  //8) Start with()
  System.out.println("start with java : "+ s.startsWith("java"));


  //9) ends with()
  System.out.println("ends with Amol : "+ s.endsWith("Amol"));


  //8) Replace
  System.out.println("replace with C++: "+ s.replace("java", "C++"));





 }    
}
