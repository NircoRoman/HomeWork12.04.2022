package HomeWork3;
import java.util.Random;
public class Leson3 {
    public static void main(String[] args) {
        HomeWork3();
        int[] forCheckBalanceArray = {1, 2, 3, 1, 2, 3, 5, 7, 9, 1};
        System.out.println(checkbalance(forCheckBalanceArray));
// Задание 1
        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            int randomArray = new Random().nextInt(2);
            arrays[i] = randomArray;
        }
        for (int i = 0; i < arrays.length; i++) {
            if( arrays[i] == 0) {
                arrays[i] = 1;
            }else if (arrays[i] == 1){
                arrays[i] = 0;
            }
        }
//  Задание 2
        int[] arrays2 = new int[101];
        for (int i = 0; i < arrays2.length; i++ ) {
            arrays2[i] = i;
        }
//  Задание 3
        int[] arrays3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrays3.length; i++){
            if (arrays3[i]<6) {
                arrays3[i] = arrays3[i] * 2;
            }
        }
//  Задание 4
        int[][] arrays4 = new int[8][8];
        for (int x = 0; x < arrays4.length; x++) {
            for (int y = 0; y < arrays4.length; y++) {
                if (x == y) {
                    arrays4[x][y]  = 1;
                }
                if( y == arrays4.length-x-1){
                    arrays4[x][y] = 1;
                }
            System.out.print(arrays4[x][y] + " ");
            }
            System.out.println();
        }
    }
// Домашнее задание 5 Вот здесь я не понял а как вывести на экран результат
    // этого метода   System.out.print(returnArrays()  ?????????
   public static int[] returnArrays ( int len , int initialValue){
        int[] arrays5 = new int[len];
        for (int x = 0; x < arrays5.length; x++){
            arrays5[x] = initialValue;
        }
        return arrays5;
    }
    public static void  HomeWork3() {
// Домашнее задание 6
         int[] MinMaxArrays = {5, 11, 19 ,3 ,4, 5, 6, 7, 8, 9, 10};
            int min = 0;
            int max = 0;
          for (int i = 0; i < MinMaxArrays.length; i++){
              if (max < MinMaxArrays[i]) {
                  max = MinMaxArrays[i];
              }
          }
        min = max;
        for (int i = 0; i < MinMaxArrays.length; i++){
            if (min > MinMaxArrays[i]) {
                min = MinMaxArrays[i];
            }
        }
        System.out.println("Минимальное в массиве = " + min +" максимальное в масиве = "+ max);
        }
// Домашнее задание 7 Это не мое решение я его списал. все что в public static boolean checkbalance
// мне понятно сам подобное написал. а то что в строках 6 7 понять не могу
public static boolean checkbalance(int[] array){
    int leftSum = 0;
    for(int i = 0; i < array.length; i++){
        leftSum += array[i];
        int rightSum = 0;
        for (int j = 0; j < array.length; j++){
            rightSum += (j > i)? array[j] : 0; // эта строчка мне покоя не дает
        }
        if(leftSum == rightSum){
            return true;
        }
    }
    return false;
}

}


