package Leson7;
public class Cat {
public String name;
public int appetite;
public boolean hungry;
        Cat(String name, int appetite , boolean hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
        }
        void info() {
        String isHungry = !hungry ? "FULL" : "Empty";
        System.out.println(name + ": " + isHungry);
        }
       void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
        hungry = false;
        }


}