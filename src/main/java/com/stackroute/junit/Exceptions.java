package com.stackroute.junit;

public class Exceptions {
    public String checkExceptions(String string) //returning exceptions
    {
        String str;
        try {
            if (string.equals(" ")) {
                throw new NullPointerException(string);
            }
        } catch (NullPointerException e) {
            str = "nullPointerException";
            return str;
        }
        return null;
    }

    public String checkTheExceptions(String string) {
        try {
            double value = Double.parseDouble(string);
            if (value > 10) {
                throw new IndexOutOfBoundsException(string);
            } else if (value < 0) {
                throw new NegativeArraySizeException(string);
            } else {
                return "valid input";
            }
        } catch (IndexOutOfBoundsException e) {
            return "index out of bound";
        } catch (NegativeArraySizeException e) {
            return "negative array size exception";
        }
    }
}
