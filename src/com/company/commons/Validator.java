package com.company.commons;

import java.util.regex.Pattern;

public class Validator {

    public static boolean doValidation(String regExp, String str) {
        return Pattern.compile(regExp).matcher(str).matches();
    }

}
