package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class AdditionOfMatricesTest {
    AdditionOfMatrices additionOfMatrices;
    int[][] expectedResult;
    int[][] actualResult;
    @Before
    public void setUp(){

        additionOfMatrices=new AdditionOfMatrices();
    }
    @Test
    public void givenMultiDimensionalMatrixReturnsSum(){
        int[][] matrix1 = {{1,2,},{3,4},{5,6}};
        int[][] matrix2 = {{9,8,},{7,6},{5,4}};
        int[][] result  = {{10,10},{10,10},{10,10}};

        actualResult=AdditionOfMatrices.additionOfTwoMatrices(3,2,matrix1,matrix2);
        expectedResult= result;
        assertArrayEquals(expectedResult,actualResult);
    }
    @After
    public void tearDown(){
        additionOfMatrices=null;
    }


}