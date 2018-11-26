package com.example.elenek.mbank.utils;

import com.example.elenek.mbank.App;
import com.example.elenek.mbank.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static final long MILLISECONDS_IN_A_DAY = 86400000;

    public static String getDate(long dateMilli) {
        Date currentDate = new Date(dateMilli);
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return df.format(currentDate);
    }

    public static String getDateWithSpecialCases(long dateMilli) {
        if (dateMilli < MILLISECONDS_IN_A_DAY)
            return App.getContext().getResources().getString(R.string.day_name_today);
        if (dateMilli < 2*MILLISECONDS_IN_A_DAY) 
            return App.getContext().getResources().getString(R.string.day_name_yesterday);
        return getDate(dateMilli);
    }

    public static String getDateWithoutYear(long dateMilli) {
        Date currentDate = new Date(dateMilli);
        DateFormat df = new SimpleDateFormat("dd.MM");
        return df.format(currentDate);
    }
}
