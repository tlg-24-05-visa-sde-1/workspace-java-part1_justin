package org.math;
//import static org.math.Calculator.*;

class CalculatorClient {
    public static void main(String[] args) {
        //We don't need to instantiate a calculator object b/c there is not point to have diff. calculator objects/instances
        //since there is no state, and we're just using the static methods.

        double sum = Calculator.add(1.5, 4.5);
        System.out.println("Sum is " +sum);

        //ex of using the static import above to use add instead of Calculator.add;
        double sum2 = Calculator.add(5, 6);
        System.out.println("Sum2 is " + sum2);

        System.out.println("Difference is " + Calculator.subtract(1, 4));

        boolean result = Calculator.isEven(9);

        System.out.println("Is even? " + Calculator.isEven(sum));
        System.out.println("Is even? " + result);

        //calling calc randoInt method
        System.out.println("Result is " + Calculator.randoInt());

        System.out.println("MinMax rando number is " + Calculator.randoInt(5, 25));

        double avgResult = Calculator.avg(3, 5, 10, 13);  //if you pass in nothing,
        // it gets turned into an array of 0 slots and will return NaN, we need to force client to pass at least 1 value.
        System.out.println("The average is: " + avgResult);


    }
}