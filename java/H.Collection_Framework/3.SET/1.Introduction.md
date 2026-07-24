# Set
. The set interface is a  part of java framework and is used to store a collection of unique element.

. unlike a list, a set does not allow duplicates

. it is used when you want only unique values.

# Example 

. imagine a classroom attendence list 

rahul
amit
rahul 
rohit

. Attendence should be

rahul
amit
rohit

-> Duplicate names are removed in set
this is exactly  how a set work 

# set hierarchy

- set
 .HashSet
   ~ No duplicate values
   ~ No insertion order
   ~ Fast performance
  
 .LinkedHashSet
   ~ NO duplicate
   ~ Maintain insertion order
 
 .TreeSet
   ~ no duplicate
   ~ Automatically sort element
   ~Stores elements in ascending order by default
