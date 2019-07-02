package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveCheckerTest {
    ConsecutiveChecker replacement;
    @Before
    public void setUp(){
        replacement=new ConsecutiveChecker();
    }
    @Test
    public void givenIntegerArrayReturnsItIsConsecutive(){
        String result=replacement.checkConsecutive(new int[]{1,2,3,4},3);
        assertEquals(" 1,2,3,4, are consecutive",result);
    }
    @Test
    public void givenIntegerArrayReturnsItIsNotConsecutive(){
        String result=replacement.checkConsecutive(new int[]{1,2,3,6,8},4);
        assertEquals(" 1,2,3,6,8 are not consecutive",result);
    }
    @After
    public void tearDown(){
        replacement=null;
    }

}