/*Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?*/

public class Task2 {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3"},{"4", "5", null}};
        //System.out.println(sum2d(array));
        //System.out.println(sum2d(new String [][] {{"1", "2", "3", "4", "5"}, {"1", "2", "3"}}));
        System.out.println(sum2d(null));
    }

    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
