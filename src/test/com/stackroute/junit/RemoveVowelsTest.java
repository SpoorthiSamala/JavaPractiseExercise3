package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels sort;
    String[] actualresult;
    String[] expectedresult;
    @Before
    public void setUp()throws Exception {
        sort = new RemoveVowels();
    }

    @Test
    public void givenArrayOfStringReturnsWordsWithoutVowels()
    {
        String input[] = {"India","United States","Germany","Egypt","czechoslovakia"};
        String output[] = {"Ind","Untd Stts", "Grmny","Egypt", "czchslvk"};
        actualresult = sort.removeVowels(input);
        expectedresult = output;
        assertArrayEquals(expectedresult,actualresult);
    }
    @After
    public void tearDown(){
        sort = null;
    }

}