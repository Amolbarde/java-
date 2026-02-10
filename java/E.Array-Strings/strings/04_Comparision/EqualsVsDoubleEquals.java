public class EqualsVsDoubleEquals
 {
  public static void main(String[] args) 
  {
    //String Literals
   String s1 = "java";
   String s2 = "java";
   
   // Using new Keyword
    String s3 = new String("java");
   
    // reference Comparision
    System.out.println("s1 == s2 :"+(s1==s2));
    System.out.println("s1 == s3 :"+(s1==s3));

    //content Comparison
    System.out.println("s1.equals(s2) : "+(s1.equals(s2)));
    System.out.println("s1.equals(s3) : "+(s1.equals(s3)));

    //Case-Sensetive vs case-insensetive
    String a = "java";
    String b = "JAVA";
    System.out.println("a.equals(b) : "+a.equals(b));

    
  }    
}

