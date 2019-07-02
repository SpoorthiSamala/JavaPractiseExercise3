package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StartAndEndDateOfWeekTest {
    StartAndEndDateOfWeek startAndEndDateOfWeek;
    String actualresult;
    String expectedresult;

    @Before
    public void setUp() throws Exception {
        startAndEndDateOfWeek = new StartAndEndDateOfWeek();
    }

    @Test
    public void givesTheStartAndEndDateOfWeek() {
        actualresult = startAndEndDateOfWeek.firstAndLastDateOfWeek();
        expectedresult = "Sun 07/07/2019";
        assertEquals(expectedresult, actualresult);
    }

    @After
    public void tearDown() {
        startAndEndDateOfWeek = null;

    }
}