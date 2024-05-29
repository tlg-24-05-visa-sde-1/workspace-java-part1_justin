package com.entertainment.client;
/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.Television;

import java.util.Arrays;

/**
     * Intended usage (by human):
     *  $ java TelevisionClientArgs <brand> <volume> <display>
     *
     * Example:
     *  $ java TelevisionClientArgs Samsung 32 PLASMA
     *
     * GOAL:
     *  Create an instance of Television with the specifications (values) provided by the user.
     */
    class TelevisionClientArgs {

        //if you don't do this, the application will crash because we'll get an array out of bounds exception
        public static void main(String[] args) {
            // must first check for the presence of your (required) 3 arguments
            if (args.length < 3) {
                //if user doesn't provide the necessary info, tell them.  Here, we check if they provided 3 args, if not,
                //we tell them and what they need to provide and with "return" stop the program there.  If we have 3 we
                //continue onto next statement.
                String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
                String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
                String note = "Notes: \n" +
                        "1. Available brands are " + Arrays.toString(Television.VALID_BRANDS) + "\n"
                        + "Volume must be " + Television.MIN_VOLUME + " to " + Television.MAX_VOLUME + "\n" +
                        "3.  Supported displays are " + Arrays.toString(DisplayType.values());
                System.out.println(usage);
                System.out.println(example);
                System.out.println(note);
                return;  // early return from main(), application exits
            }

            // at this point, you can safely proceed, because you got your arguments
            // first, let's just show that we got them
            System.out.println("You provided " + args.length + " arguments");

            int volume = Integer.parseInt(args[1]);  //to convert from String to integer
            DisplayType display = DisplayType.valueOf(args[2].toUpperCase());  //to convert from String to enum type (.valueOf())

            Television tv = new Television(args[0], volume, display);
            System.out.println(tv);
        }
    }

