//primitive

//float
//short < 32000
//int
//double
//long 


//non-primitive

//character - single character words
//boolean - either true or flase
//byte
// Array - collection of data such as doubles, int etc.
// class 

/*
Constants
*/
class Main {
    public static void main(String[] args) {
      //declaring strings
      String daniel = "Daniel. Wow, that's my name and it's";
  
      //declaring booleans
      boolean dan = true;
      System.out.println("Boolean :" + dan);
  
      //declaring intergers
      int dante = 20;
      System.out.println("Interger :" + dante);
  
      //declaring doubles
      double dob = 120.99;
      System.out.println("Double :" + dob);
  
      //declaring float
      float flot = 2f;
      System.out.println("Float : " + flot);
  
  
      //declaring characters
  
      char character = 'a';
      System.out.println("Character :" + character);
  
      System.out.println(daniel + dan);
  
  
  
      // Data  - they are used to store small amounts of data
      byte dan3 = 126;
      System.out.println("Byte : " + dan3);
  
      //defining long
      long dan2 =  100000000l;
      System.out.println("long : " + dan2);


      //constants
      final int y =10;
      int x = 20;
      System.out.println(x*y);

      String myName = "Black";
      char letter = 'A';
      double z = 2.2;
      //or
      double f = 2d;

      System.out.print(myName);
      System.out.print(letter);
      System.out.print(z);
      System.out.println("Double :" + f);
    }
  }