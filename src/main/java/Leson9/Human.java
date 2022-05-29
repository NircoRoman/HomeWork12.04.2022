package Leson9;

public class Human implements Action{
    private String name;
    private int run;
    private int jump;

    public Human(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public int getRun() {
        System.out.println("Human " + name + " Run "+ run);
        return run;
    }

    @Override
    public int getJump() {
        System.out.println("Human " + name + " Jump "+ jump);
        return jump;
    }
}
