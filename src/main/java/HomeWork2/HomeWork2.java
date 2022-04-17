package HomeWork2;
import java.util.Random;
import java.util.Scanner;

// Домашняя работа 2
public class HomeWork2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int yearnumver;
    int randomNumber1 = new Random().nextInt(15);
    int randomNumber2 = new Random().nextInt(15);
    checkNumber(randomNumber1,randomNumber2);
    comparison(randomNumber1+randomNumber2);
    orText("Печатаем строку номер - ",randomNumber1+randomNumber2);
    System.out.println("Введите год чтобы узнать высокосный он или нет - ");
    yearnumver = scanner.nextInt();
    scanner.close();
    earch(yearnumver);
    }
    public static boolean checkNumber(int a, int b ){
       int enter = a + b;
       if (enter <=20 && enter >=10){
           System.out.println("Число в пределах = " + enter +" True");
           return true;
       }else {
           System.out.println("Число не верно = " + enter +" False");
           return  false;
       }
    }
    public static boolean comparison(int a){
        if (a % 2 !=1 || a ==0){
            System.out.println(a + " True Целое число");
            return true;
        } else {
            System.out.println(a + " False Число не целое");
            return false;
        }
    }
    public static String orText (String a, int b){
        for (int i =0; i < b;i++ ){
            System.out.println(a +i);
        }
        return a;
    }
    public static void earch(int a){
        if(a%4==0 && a%100 !=0 || a%400==0) {
            System.out.println("Год высокосный !");
        }else
            System.out.println("Не высокосный год !");
        }

}
