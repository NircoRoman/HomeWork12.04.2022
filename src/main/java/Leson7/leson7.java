package Leson7;

import java.util.Scanner;

public class leson7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int summFood = 0;
        Cat[] cats = {
                new Cat("Vasia", 40 , false),
                new Cat("Murzik", 30 , false),
                new Cat("Kuzia", 25, false),
                new Cat("Lelik", 35, false),
                new Cat("Fill", 15, false)};
                System.out.println("Let's put some food on a plate");
                Plate plate = new Plate(sc.nextInt());
            for (Cat cat : cats) {
                 cat.eat(plate);
                 cat.info();
        }
            System.out.println("Food Enable " + plate.food);
            for (int i = 0; i <= cats.length -1; i++){
            if (cats[i].hungry == true){
                summFood += cats[i].appetite;
                System.out.println("Cat Name " + cats[i].name + "  stayed hungry! " + " Need add food -" +
                        cats[i].appetite);
            }
        }
            System.out.println("Your need add food from cat - " + (summFood - plate.food));
            System.out.println("Add Food Now !!!");
            int foodAdd = sc.nextInt();
            if (foodAdd != summFood - plate.food){
                if (foodAdd < summFood - plate.food){
                    System.out.println("The cats didn't eat and died");
                }
                if (foodAdd > summFood - plate.food){
                    System.out.println("Died of overeating");
                }
            }
            if (foodAdd == summFood - plate.food){
                System.out.println("Everyone is full");
            }
    }
}