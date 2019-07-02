package com.stackroute.junit;

public class ChessBoard {
    public static String[][] chessBoard() //to print a chessboard
    {
        String array[][]=new String[8][8];
        String str="";
        for(int i=0;i<8;i++)
        {
            for (int j=0;j<8;j++)
            {
                if(i%2==0) {
                    if (j % 2 == 0) {
                        array[i][j] = "WW|";

                    } else {
                        array[i][j] = "BB|";
                    }
                }
                else {
                    if (j % 2 == 0)
                        array[i][j] = "BB|";
                     else
                        array[i][j] = "WW|";
                }


            }
        }
        return array;
    }
}
