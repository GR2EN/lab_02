package com.laboratory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Введите данные:");

	    //Инициализируем строку
        Scanner scr = new Scanner(System.in);
        String inputString = scr.next();

        CodeChecker checkObject = new CodeChecker();

        if (checkObject.checkThisCode(inputString)) System.out.println("Введенные данные являются HTML-цветом");
        else System.out.println("Введенные данные НЕ являются HTML-цветом");
    }
}
