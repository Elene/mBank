package com.example.elenek.mbank.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String getDate(long birthDateMilli) {
        Date currentDate = new Date(birthDateMilli);
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return df.format(currentDate);
    }
}
