class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();

        //just checking to make sure isMuted defaults to false since we just declared it and didn't assign its value
        System.out.println(tv.isMuted);

        //setVolume() validation boundary testing
        tv.setVolume(0);  //should be valid
        System.out.println(tv);
        tv.setVolume(-1);  //should be invalid and throw error, volume should still be 0
        System.out.println(tv);
        tv.setVolume(100);  //should be valid and volume should be 100
        System.out.println(tv);
        tv.setVolume(101);  //should be invalid and volume should still be 100
        System.out.println(tv);

        //setBrand() validation boundary testing
        tv.setBrand("Toshiba"); //should be valid and setBrand to Toshiba
        System.out.println(tv);
        tv.setBrand("TLC"); //should be invalid
        System.out.println(tv);
        tv.setBrand("Sony");  //should be valid
        System.out.println(tv);
        tv.setBrand("LG");  //should be valid
        System.out.println(tv);
        tv.setBrand("DELL");  //should be invalid
        System.out.println(tv);
        tv.setBrand("sony"); //should be valid b/c we used the String method .equalsIgnoreCase(), which is case-insensitive
        System.out.println(tv);


        System.out.println(tv.isMuted());
    }
}