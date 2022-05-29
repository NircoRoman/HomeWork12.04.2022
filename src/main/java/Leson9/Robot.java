package Leson9;

public class Robot implements Action{
    private String name;
    private int run;
    private int jump;

    public Robot(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public int getRun() {
        System.out.println("Robot " + name + " Run "+ run);
        return run;
    }

    @Override
    public int getJump() {
        System.out.println("Robot " + name + " Jump "+ jump);
        return jump;
    }
}
