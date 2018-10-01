package com.revature.banking;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for BankAccount class.
 */
public class BankAccountTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BankAccountTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BankAccountTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
	account = new BankAccount();
	assertEquals(account.aaaaaaankaccoun
        //assertTrue( true );
    }
}
