package Leson6;

public class Run {
    public static void main(String[] args) {
        Animals[] animal = new Animals[4];
        animal[0] = new Cat("Кот" , "Кузя" , 2 , 200 );
        animal[1] = new Cat("Кошка","Мая",1 , 180);
        animal[2] = new Dog("Борзая" , "Культ" , 20 , 800 );
        animal[3] = new Dog("Дворняга ","Дизель",10 , 500);
        System.out.println("Характеристики созданных животных");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < animal.length; i++) {
            animal[i].printf();
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Всего котов создано: " + Cat.getCount());
        System.out.println("Всего Собак создано: " + Dog.getCount());
        System.out.println("Проверка на выносливость ");
        System.out.println("Бег");
        for (int i = 0; i < animal.length; i++) {
            animal[i].run(500);
        }
        System.out.println("Плаванье ");
        for (int i = 0; i < animal.length; i++) {
            animal[i].swim(20);
        }
    }
}
