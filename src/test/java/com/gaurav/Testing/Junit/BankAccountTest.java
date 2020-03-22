package com.gaurav.Testing.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    private  BankAccount account;
    @Before
    public void setup(){
        account = new BankAccount("Gaurav","Sood",1000,true);
        System.out.println("Setting up");
    }

    @After
    public void trash(){
        System.out.println("Cleaning");
    }

    @Test
    public void deposit() {

       double balance = account.deposit(200,false);
       assertEquals(1200, balance,1);
    }

    @Test
    public void withdraw() {
        fail("Test yet to be implemented ");
    }

    @Test
    public void getBalance_deposit() {

        account.deposit(200,false);
        assertEquals(1200, account.getBalance(),1);
    }

    @Test
    public void getBalance_withdraw() {

        account.withdraw(200,false);
        assertEquals(800, account.getBalance(),1);
    }

    @Test
    public void isChecking_true() {

       assertTrue(account.isChecking());
    }

    @Test
    public void isChecking_false() {

        //assertTrue("Error Message: your assertion has failed",account.isChecking());

    }


}