class A
  {
    void m1()
    {
      System.out.println("I am class A (Parent)");
    }
  }
class B extends A
  {
    void show()
    {
      super.m1()
        System.out.println("I am class B");
    }
  }
class Demo
  {
    public static void main(String abc[])
    {
      B ob=new B();
      ob.show();
    }
  }

// I am class A (Parent)
// I am class B
