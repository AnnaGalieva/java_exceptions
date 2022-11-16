/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
запросить у пользователя ввод данных.*/
package Homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try{
            setNumber();
        }catch (NumberFormatException e){
            System.out.println("Вы ввели не число! Попробуйте ещё раз!");
            setNumber();
        }
    }
    public static void setNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        float number = Float.parseFloat(scanner.nextLine());
        System.out.printf("Вы ввели, %s!", number);
        scanner.close();
    }
}
