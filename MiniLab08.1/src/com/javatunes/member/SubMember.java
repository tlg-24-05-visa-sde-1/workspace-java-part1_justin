/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.member;

public class SubMember extends Member {

    public SubMember() {
        // NOTE: there is a call to super() (super class call to Member) here! as the first line of code
        super("Justin");
        System.out.println("SubMember ctor");
    }
}