/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package gov.irs;

/**
 * An argument can be made that the tax rate constants are better defined
 * on the classes that use them, and not all lumped in here.
 * 
 * We've decided that, since these are federally mandated tax rates, they 
 * are better left here.  This bends cohesion a bit, but strengthens open-closed:
 *   If the IRS were to change tax rates, we would only need to change that here.
 */
public interface TaxPayer {
    //we can include class constants here, public static finals.
    public static final double HOURLY_TAX_RATE = 0.25;
    public static final double SALARIED_TAX_RATE = 0.30;

    //tells us TaxPayers payTaxes() but don't tell us HOW they do it. payTaxes is implicitly abstract.
    public void payTaxes();

    //if we add a method afterwards, we can break an existing implementation class if they don't have it.
    //We call this a BREAKING CHANGE, it breaks other classes.  So what do we do if we need to evolve an
    //interface and make changes.

    //Interfaces can contain default methods and not just abstract methods as we said before.  We
    //can write code.  Use default and put in a block of code with a default way of doing the method.
    //this won't break the existing classes that implement the Interface
    default public void fileReturn(){
        System.out.println("Return filed by US Mail");
    }
}