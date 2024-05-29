public class TelevisionClient {
        public static void main(String[] args) {
            //testing instance counter
            System.out.println(Television.getInstanceCount() + " instances have been created");

            //create a Television object/instance and set its properties - Instantiation
            Television tv1 =  new Television();
            tv1.setBrand("Samsung");
            tv1.setVolume(20);
            tv1.setDisplay(DisplayType.OLED);

            //create a second Television object/instance and set its properties - Instantiation
            //LED display by default if not specified
            Television tv2 = new Television();
            tv2.setBrand("TCL");
            tv2.setVolume(2);

            //create a third Television object that will receive the default values for the fields/props from class def.
            //instantiation
            Television tv3 = new Television();

            //call some business methods on the objects, i.e. turn them "on" and "off"
            tv1.turnOn();
            tv1.turnOff();

            tv2.turnOn();
            tv2.turnOff();

            tv3.turnOn();
            tv3.turnOff();

            tv1.setVolume(Television.MAX_VOLUME);
            tv2.setVolume(Television.MIN_VOLUME);

            //printing toString()s
            System.out.println("tv1 " + tv1);
            System.out.println("tv2 " + tv2);
            System.out.println("tv3 " +tv3);


            //Create instances using constructors we just made

            Television tv4 = new Television("LG");
            System.out.println("tv4 " + tv4);

            Television tv5 = new Television("Sony", 50);
            System.out.println("tv5 " + tv5);

            Television tv6 = new Television("Sony", 40, DisplayType.LED);

            //Testing instance counter
            System.out.println(Television.getInstanceCount() + " instances have been created");

        }
    }


