package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;

    @Before
    public void setUp() {
        chessBoard = new ChessBoard();
    }

    @Test
    public void givenMultiDimensionalArrayReturnsChessBoard() {
        String[][] result = chessBoard.chessBoard();
        assertArrayEquals(new String[][]{{"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}, {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"}
                , {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}, {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}, {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}, {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"}}, result);
    }
    @After
    public void tearDown(){
        chessBoard=null;
    }
}