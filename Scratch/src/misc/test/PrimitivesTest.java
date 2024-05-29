package misc.test;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 43;
        System.out.println("Age is : " + age);

        //We have to put the L after the number since assignment is R to L, and this number is too large for int.
        //You can use underscores as separators in numbers for readability
        long population = 8_000_000_000L;
        System.out.println("The Earth's population is about : " + population);

        double temperature = 90.2;
        System.out.println("The Temperature in Austin is : " + temperature);

        boolean isCloudy = true;
        System.out.println("isCloudy? : " + isCloudy);

        //no methods on chars b/c they are primitives
        char grade = 'A';
        System.out.println("Grade is:" + grade);

        //here we do have a lot of methods we can call on it b/c it's a string
        String size = "L";
        System.out.println("size is: " + size.toLowerCase());

        System.out.println();


        int x = 3;

        System.out.println("x is: " + ++x);
        System.out.println(x);

        /*
        here we initialize b to the value of a, but they point to two different places in memory and b isn't affected
        by what we then do to a
         */
        int a = 5;
        int b = a;
        a++;
        System.out.println(b);
    }
}