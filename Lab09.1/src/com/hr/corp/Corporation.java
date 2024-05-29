/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp;

import gov.irs.TaxPayer;

/**
 * Corporate entity - also pays taxes.
 */
public class Corporation implements TaxPayer {
    private String name;

    public Corporation(String name) {
        setName(name);
    }

    @Override  // interface TaxPayer - has to have payTaxes() method or we'll get an error b/c the interface demands it.
    public void payTaxes() {
        System.out.println(getName() + " paid no taxes - we lobbied hard and it worked");
    }
    //I am opting to do this behavior differently.  If we don't say anything about fileReturn(), we do it
    //the default way inherited from TaxPayer
    @Override  //interface TaxPayer
    public void fileReturn(){
        System.out.println("Return not filed - we sent our lawyers instead");
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}