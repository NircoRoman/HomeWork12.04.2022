package ru.gb.nirco;

public class HomeWorkApp {
    public static void main(String[] args) {
    printThreeWords();
    checkSumSing();
    printColor();
    compareNumbers();

    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Aplle");
    }
    public static void checkSumSing(){
        int a = 2;
        int b =-3;
        if (a >=0) System.out.println("Сумма положительная a= " +a);
        if (b <=-1) System.out.println("Сумма отрицательная b= " +b);
    }
    public static void printColor() {
        int value = 0;
        if (value<=0) System.out.println("Красный");
        if (value <=100 & value !=0) System.out.println("Желтый");
        if (value >100) System.out.println("Зеленый");
    }
    public static void compareNumbers(){
        int a,b;
        a = 4;
        b = 7;
        if (a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
    }
}
