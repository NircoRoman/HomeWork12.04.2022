package Leson6;

public class Cat extends Animals{
    private static int Count;
    public Cat (String type , String name , int swim , int run ){
        this.type = type;
        this.name = name;
        this.swim = swim;
        this.run = run;
        Count++;
    }
    public static int getCount(){
        return Count;
    }


}
