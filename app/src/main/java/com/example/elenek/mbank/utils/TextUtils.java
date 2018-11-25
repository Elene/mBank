package com.example.elenek.mbank.utils;

public class TextUtils {

    public static boolean isEmpty(String toCheck) {
        return toCheck.equals("");
    }

    public static boolean hasValidLength(String toCheck) {
        return toCheck.length() >= 3;
    }

}
