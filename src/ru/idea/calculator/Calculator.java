package ru.idea.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operator;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа:\n");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("Введите символ (+, -, *, /): ");
        operator = reader.next().charAt(0);
        switch(operator) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
            default:  System.out.printf("Ошибка! Введите корректный символ");
                return;
        }
        System.out.println("Результат получился следующий:");
        System.out.printf(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
