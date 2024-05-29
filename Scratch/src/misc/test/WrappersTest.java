package misc.test;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "43";
        int age = Integer.parseInt(ageInput);  //takes string "43" and returns int 43
        Integer ageInteger = Integer.valueOf(age);  //takes int 43 and returns an Integer object with 43 "inside"

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput); //returns primitive long
        Long populationLong = Long.valueOf(population);  //returns Long object with population long inside

        String sizeInput = "9.5";
        double size = Double.parseDouble(sizeInput); //returns primitive double
        Double sizeDouble = Double.valueOf(size); //returns Double object

        String isRainingInput = "true";
        boolean isRaining = Boolean.parseBoolean(isRainingInput);  //returns primitive boolean
        Boolean isRainingBoolean = Boolean.valueOf(isRaining);  //returns Boolean object
    }
}