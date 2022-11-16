/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/
package Homework2;

import java.util.Scanner;

public class Task4 {
    static String stringException() {
        String result = null;
        System.out.print("Введите строку: ");

        try {
            Scanner scanner = new Scanner(System.in);
            result = scanner.nextLine();
            scanner.close();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так.");
        }

        return result;
    }

    public static void main(String[] args) {
        String temp = stringException();
        if (temp.length() == 0)
            System.out.println("Пустые строки вводить нельзя.");

    }

}
