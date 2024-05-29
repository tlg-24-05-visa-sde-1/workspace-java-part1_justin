package edu.wakeup;
/*
 *  This is a main-class focused on testing setter validation logic.
 *  Do thorough BVT (Boundary Value Testing) on the setter methods of edu.wakeup.AlarmClock.
 *  Here, we are doing BVT (Boundary Value Testing) on setSnoozeInterval().
 *  That is, we check the values on the edges on teh valid range, and just outside it.
 *  For us that is 0,1 and 20,21
 */

class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);  //should be valid, should "stick", i.e., the value should be stored.
        System.out.println(clock);   //should show 1 for snoozeInterval b/c of toString()
        System.out.println(clock.getSnoozeInterval());  //should also just show snoozeInterval

        clock.setSnoozeInterval(20);  //should be valid
        System.out.println(clock);  //should show a 20, value should now be 20.

        clock.setSnoozeInterval(0);  //should not be valid
        System.out.println(clock);   //error message, and value not set.  value should still be 20.


        clock.setSnoozeInterval(21);  //should be invalid
        System.out.println(clock);     //error message, and value not set.  value should still be 20.
    }
}