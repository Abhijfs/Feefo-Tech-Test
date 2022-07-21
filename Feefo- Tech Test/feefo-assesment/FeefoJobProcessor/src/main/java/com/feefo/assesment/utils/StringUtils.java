package com.feefo.assesment.utils;

public class StringUtils {

    public static String stringFromCapitalizedSnakeCase(String s) {
        s = s.trim();
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase().replace("_", " ");
    }
}
