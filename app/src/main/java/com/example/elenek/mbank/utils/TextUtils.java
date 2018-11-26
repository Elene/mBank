package com.example.elenek.mbank.utils;

import android.content.res.Resources;
import android.util.Log;

import com.example.elenek.mbank.App;
import com.example.elenek.mbank.R;

public class TextUtils {

    public static boolean isEmpty(String toCheck) {
        return toCheck.equals("");
    }

    public static boolean hasValidLength(String toCheck) {
        return toCheck.length() >= 3;
    }

    public static String getValidationErrorMessage(String toCheck) {
        if (TextUtils.isEmpty(toCheck))
            return App.getContext().getResources().getString(R.string.error_message_emtpy);
        if (!TextUtils.hasValidLength(toCheck))
            return App.getContext().getResources().getString(R.string.error_message_length);

        return null;
    }

}
