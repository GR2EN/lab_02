package com.laboratory;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CodeChecker {
    public static boolean checkThisCode(String inputCode) {
        //Инициализируем паттерн
        Pattern ptr = Pattern.compile("^#([a-z]|[A-Z]|[0-9]){6}$");
        Matcher mtr = ptr.matcher(inputCode);

        return mtr.matches();
    }
}
