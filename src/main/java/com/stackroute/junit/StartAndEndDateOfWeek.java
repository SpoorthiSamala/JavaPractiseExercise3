package com.stackroute.junit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StartAndEndDateOfWeek {
    String str;
    //method to display start and end of week

    public static String firstAndLastDateOfWeek() {
        String str;
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        str = df.format(c.getTime());
        for (int i = 0; i < 6; i++) {
            c.add(Calendar.DATE, 1);
        }
        str = df.format(c.getTime());
        return str;

    }
}
