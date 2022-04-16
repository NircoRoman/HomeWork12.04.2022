package HomeWork2;
import java.util.Random;
// Домашняя работа 2
public class HomeWork2 {
    public static void main(String[] args){
    int randomNumber1 = new Random().nextInt(15);
    int randomNumber2 = new Random().nextInt(15);
    checkNumber(randomNumber1,randomNumber2);
    }
    public static boolean checkNumber(int a, int b ){
       int enter = a + b;
       if (enter <=20 && enter >=10){
           System.out.println("Число в пределах =" + enter +" True");
           return true;
       }else {
           System.out.println("Число не верно " + enter +" False");
           return false;
       }
    }
}
