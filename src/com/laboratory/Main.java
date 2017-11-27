package com.laboratory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Введите данные:");

	    // Принимаем строку от пользователя
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        // Проверяем на корректность HTML-цвета
        CodeChecker checkObject = new CodeChecker();
        System.out.print(checkObject.checkThisCode(inputString));
    }
}
