package org.math;

class CalculatorTest {

    public static void main(String[] args) {

        boolean isCorrect = true;

        //call org.math.Calculator.randomInt(5,20) 1,000,000 times
        //if it ever comes back < 5 or > 20, we know it doesn't work right
        //isCorrect starts as true because we assign it above.

        //we do a for loop to run it 1,000,000 times and should get It WORKS if isCorrect stays true
        for (int i =0; i<1_000_000; i++){
            int result = Calculator.randoInt(5,20);
            if (result < 5 || result > 20 ) {
                isCorrect = false;
                break;  //breaks out if isCorrect is false
            }
        }

        if (isCorrect) {
            System.out.println("It WORKS!!!");
        }
        else {
            System.out.println(("It's BROKEN!!!"));
        }

    }

}