package Leson3;
import java.util.Random;
public class Leson3Arrays {
    public static void Arrays (String args[]){
            int[] arrays = new int[10];
            int randomArray = new Random().nextInt(2);
            for (int i = 0; i<=arrays.length; i++){
                arrays[i] = randomArray;
                System.out.print(arrays[i] + " ");

        }
    }

}
