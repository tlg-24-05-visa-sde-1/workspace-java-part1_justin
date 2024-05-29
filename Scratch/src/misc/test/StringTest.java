package misc.test;

class StringTest {
    public static void main(String[] args) {
        String city1 = "new york";
        String city2 = "new york";

        //  == DOESN'T always work for String comparisons, ALWAYS use .equals()

        System.out.println(city1.equals(city2));  //this is what you SHOULD do, returns true

        System.out.println(city1 == city2);  //this is what you SHOULDN'T do, returns true

        System.out.println();  //prints a blank line

        String newCity1 = city1.substring(0,3);  // "new"
        String newCity2 = city2.substring(0,3);  // "new"

        System.out.println(newCity1.equals(newCity2));  //RIGHT WAY, returns true
        System.out.println(newCity1 == newCity2);  //WRONG WAY, returns false

        System.out.println();

        String greeting = "What's up \"Doc?\"";    //   \ is an escape character and you can do two double quotes
        System.out.println(greeting);
        System.out.println();

        System.out.println("roses are red \nviolets are blue");  // \n means next line
        System.out.println();

        //triple double quotes will let you print on separate lines without \n
        System.out.println("""     
                Line "1"
                Line 2
                LIne 3
                """);
        System.out.println();

        String pattern = "\\d{3}[A-Z]{3}|[A-Z]{1}\\d{3}[A-Z]{3}";  //any digit 3 times followed by any capital letter 3 times OR 1 capital letter A-Z, 3 digits, 3 capital letters
        String plate1 = "637YOC";
        String plate2 = "A123XYZ";
        String plate3 = "AAAAAA";
        plate1.matches(pattern);
        System.out.println("This License plate is valid: " + plate1.matches(pattern));  //will return true if it matches pattern
        System.out.println("This License plate is valid: " + plate2.matches(pattern));
        System.out.println("This License plate is valid: " + plate3.matches(pattern));
    }
}