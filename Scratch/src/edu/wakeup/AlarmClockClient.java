package edu.wakeup;

/*
 * Client-side "main-class" (class definition ith the main() method).
 * It will create a few instances of edu.wakeup.AlarmClock and give them a basic test-drive.
 */
class AlarmClockClient {

    public static void main(String[] args) {
        //create an edu.wakeup.AlarmClock object and sets its properties.  Setting the snoozeInterval here is a bad idea.
        /*Encapsulation/Data-hiding - We can expose methods by making them public if we want clients to call them,
         * but not a good idea to make fields public.
        */
        AlarmClock clock1 = new AlarmClock();
//        clock1.snoozeInterval = 7;
        clock1.setSnoozeInterval(7);

        //create a second instance and set its properties too
        //here we create a second instance using the snoozeInterval constructor (ctor)
        //If this client wants to set the max snooze interval we can use the public final static variable.
        //we reference the MAX_INTERVAL variable as below with the class name.
        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL);
//        clock2.setSnoozeInterval(10);

        //create a third instance BUT this time don't set its properties.  It defaults the property of int type to 0.
        AlarmClock clock3 = new AlarmClock();

        //we have two instances - we'll call snooze on one of them.  This is a client side call.
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        //see their toString() methods in action
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3.toString());

        //most developers would just print clock1 instead of clock1.toString(), you get the same thing.
        System.out.println(clock1);

    }
}