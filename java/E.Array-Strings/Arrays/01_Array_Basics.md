* What is an Array
-> Array = Array is use to store many values in one varible

* Example

   int a = 10;
   int a = 20;
   int a = 30;
* we write

  int[] arr = {10,20,30};

* Why do we uses Arrays?
 - to store many values .
 - to reduce code .
 - to use loop easily
   
------------------------------------------------------------
* creting array

  @ step1-Declare
    int[] arr;
   
   @ step2-Create Memory
    arr = new int[5];
OR
   @ both in one line
    int[] arr = new int[5];

   @ step3-put value
    a[0] = 10;
    a[1] = 20;
OR
    int[] arr = {10,20};

   @step4- get value
     System.out.println(arr[0]);


@@ Array Length
      System.out.println(arr.length);
------------------------------------------------------------

* Printig Array
 
 @1:for Loop
 for(int i=0; i<arr.length; i++)
 {
     System.out.println(arr[i]);
 }

@2:for-each loop
for(int x : arr)
{
     System.out.println(x);
}