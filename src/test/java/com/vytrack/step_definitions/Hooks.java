package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tThis is coming from before method");
    }
    @After
    public void tearDown(){
        System.out.println("\tThis is coming from after method");
    }
    @Before("@db")
    public void setUpdb(){
        System.out.println("\tConnecting to database");
    }
    @After("@db")
    public void closedb(){
        System.out.println("\tDisconnecting to database");
    }

}
