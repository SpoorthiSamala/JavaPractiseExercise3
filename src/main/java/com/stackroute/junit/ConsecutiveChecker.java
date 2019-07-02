package com.stackroute.junit;

public class ConsecutiveChecker {
    public static String checkConsecutive(int array[], int size) //checking whether the given inputs are consecutive or not
    {
        boolean b = true;

        String string = " ";
        for (int i = 0; i < size; i++) {
            if (array[i + 1] - array[i] == 1) {

            } else
                b = false;
        }
        if (b) {
            for (int i = 0; i <= size; i++) {
                string = string + array[i] + ",";
            }

            return string + " are consecutive";

        } else {
            for (int i = 0; i <= size; i++) {
                if(i==size)
                {
                    string = string + array[i];
                }
                else
                string = string + array[i] + ",";
            }
                return string + " are not consecutive";

        }
    }
}

