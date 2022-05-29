package Leson9;

import java.util.Random;

public class Start {
    public static void main(String[] args) {
        boolean winner = false;
        Random random = new Random();
        Action[] actions = new Action[3];
        Mission[] missions = new Mission[6];
        actions[0] = new Cat("Barsik" , random.nextInt(100), random.nextInt(30));
        actions[1] = new Human("Radeon" , random.nextInt(100), random.nextInt(40) );
        actions[2] = new Robot("Robo", random.nextInt(150), random.nextInt(50) );
        missions[0] = new Road(random.nextInt(100));
        missions[1] = new Road(random.nextInt(100));
        missions[2] = new Road(random.nextInt(100));
        missions[3] = new Wall(random.nextInt(30));
        missions[4] = new Wall(random.nextInt(30));
        missions[5] = new Wall(random.nextInt(30));

      for (int i =0; i < actions.length; i++) {
            winner =false;
            if (winner == false) {
                for (int x = 0; x < missions.length; x++){
                int roadlenth = missions[x].roadLength();
                int jumpHeight = missions[x].wallHeight();
                int run = actions[i].getRun();
                int jump = actions[i].getJump();
                if (run >= roadlenth){
                    winner = false;
                    System.out.println("Success !!!");
                }else if (jump >= jumpHeight){
                    winner = false;
                    System.out.println("Success !!!");
                }else
                    {
                    winner = true;
                    System.out.println("Unsuccessful !!!");
                    System.out.println("Disqualification !!!");
                    break;
                }
                }

            }
        }



    }
}
