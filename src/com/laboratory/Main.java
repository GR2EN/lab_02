package com.laboratory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Введите данные:");

	    // Принимаем строку от пользователя
        Scanner scr = new Scanner(System.in);
        String inputString = scr.next();

        // Проверяем на корректность HTML-цвета
        CodeChecker checkObject = new CodeChecker();
        System.out.print(checkObject.checkThisCode(inputString));
    }
}
