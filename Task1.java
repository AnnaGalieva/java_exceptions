/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения*/

public class Task1 {
    static int firstMetod() {
        int result = 10 / 0;

        return result;
    }

    static int[] secondMetod() {

        int[] result = new int[10];

        result[100] = 1;

        return result;
    }

    static int thirdMetod() {
        String temp = null;

        int result = temp.length();

        return result;
    }

    public static void main(String[] args) {
         //System.out.println(firstMetod());
         //System.out.println(secondMetod());
        System.out.println(thirdMetod());
    }
}
