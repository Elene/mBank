package com.example.elenek.mbank.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String getDate(long dateMilli) {
        Date currentDate = new Date(dateMilli);
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return df.format(currentDate);
    }

    public static String getDateWithoutYear(long dateMilli) {
        Date currentDate = new Date(dateMilli);
        DateFormat df = new SimpleDateFormat("dd.MM");
        return df.format(currentDate);
    }
}
