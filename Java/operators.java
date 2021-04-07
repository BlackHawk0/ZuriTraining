class Main{
    public static void main(String[] args) {
        int x = 10;

        //final is used to define/ declare a constant
        final int y =20;
        int z;

        boolean c;

        //operators
        /*
        Arithmentic operators 
        *, -, / +
        */
        z = x+y;
        System.out.println(z);


        z = x*y;
        System.out.println(z);

        z = x/y;
        System.out.println(z);
        /*

        Assignment operator
        =, 
        +=  - it takes the value on the right, the adds
                to the value contained in the variable
                on the left to give the variable a new value.
        -= - viceversa



        */

        x += 3;

        System.out.println (x);
        

        x -= 4;
        System.out.println (x);

        x/=5; // Divide the current vale of x with 5 and assign the 
                // results to the variable on the left.
        System.out.println (x);

        x*=4;
        System.out.println(x);

        //comparison operators - the result is always a boolean
        // == is used to check equality.
        
        c = x == y;
        System.out.println(c);

        //< less than operator

        c = x < y;
        System.out.println(c);

        // <= less than or equal to

        c =x <= y;
        System.out.println(c);

        // > greater than
        c = x > y;
        System.out.println(c);

        // >= greater or equal to
        c = y >= x;
        System.out.println(c);

        //!= NOT EQUAL TO
        c = x != y;
        System.out.println(c);

        //Logical operators
        //&& and operator -  checks if the value on the right and left are true to give a true outcome.
        //|| or operator - checking if either the condion on the left
        // is true
        // ! not operator



    }
}