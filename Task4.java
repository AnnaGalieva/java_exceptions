/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь
 может увидеть - RuntimeException, т.е. ваше */

import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 1, 0, 1, 1};
        System.out.println(Arrays.toString(method(array1, array2)));
    }

    public static int[] method(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("массивы не равны!");
        }
        int[] array = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("делить на ноль нельзя!");
            }
            array[i] = arr1[i] / arr2[i];
        }
        return array;
    }
}
