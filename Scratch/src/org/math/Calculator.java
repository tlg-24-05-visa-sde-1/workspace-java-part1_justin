package org.math;
import static java.lang.Math.*;

class Calculator {

    /*
     * This is an "all-static" class, i.e., one with nothing but static methods.
     * These methods are called from clients as org.math.Calculator.add(), org.math.Calculator.subtract(), etc.
     * these are statics methods - there will be no diff. if called by a calc instance, just one off methods to add/sub
     * there is no state in the indiv. calculator objects we make
     * there are no instance variables - what makes one calculator instance diff. from another?
     * NOTHING b/c there is no state, no variables.  It doesn't make sense to have diff. calculator objects/instances.
     */

    /*
     * Returns the average of the supplied integers.
     */
    public static double avg(int first, int... rest){ //3, 5, 10, 13
        double result = 0.0;
        int sum = first;  //make the sum start our as the value of the first int that we require the client to supply.
        //we can't add directly onto the array, because arrays are fixed length in java
        for(int value : rest){
            sum += value;
        }
        //we can cast sum to a double or just multiply 1.0 * sum to make sure it's a double and the result will be a double.
        result = ((double) sum)/(rest.length+1);
            return  result;
    };

    public static double add(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    /*
     * indicates if the supplied integer is even or not
     */

    public static boolean isEven(double value){
        //if value%2 is 0, it returns true, if not false
        return value % 2 == 0;
        }


        /*
         * Returns a random integer between 'min' and 'max' (inclusive)
         * TODO: optional challenge
        */

    //        you can have methods with the same name as long as their signature is different, in this case their arguments
    //        are different.  This is called Method Overloading- methods with same name in same class diff w/diff signature
    //overloaded methods can call each other
        public static int randoInt(int min, int max){
            int result = 0;
            //b/c of our static import we can just call random() instead of Math.random();
            double randSample = random();
            double rand= Math.random();
            double scaled = (rand * (max - min +1)) + min;
            result = (int) scaled;
            return result;
        }

    //Returns a random integer between 1 and 'max';  We call the other method from above and feed it the min (1)
    //convenience method - delegates work to the method above, passing 1 for 'min'
    public static int randoInt(int max){
       return randoInt(1, max);
    }

    /*
     * Returns a random integer between 1 and 16 (inclusive)
     * Hint: see a class called Math (in package java.lang), look for a helpful method here.
     * NOTE: these are static, which means you call them as follows: Math.methodName() or Math.sqrt().
     * rand and scaled are local variables - scoped only to the method
     */

    public static int randoInt(){

        int result = 0;

        double rand = Math.random()*16;
        double scaled = rand + 1;
        //this is an explicit downcast so rand becomes an integer;
        result = (int) scaled;

        return result;

//    we can do this in one line too
//     return (int)(Math.random() * 16 +1);
}
}