package com.laboratory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeChecker {
    public boolean checkThisCode(String inputCode) {
        // Инициализируем паттерн
        Pattern ptr = Pattern.compile("^#([a-f]|[A-F]|[0-9]){6}$");
        Matcher mtr = ptr.matcher(inputCode);

        // Возвращаем результат корректности
        return mtr.matches();
    }
}
