package Leson9;

public class Cat implements Action{
    private String name;
    private int run;
    private int jump;

    public Cat(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public int getRun() {
        System.out.println("Cat - "+ name + " Run " + this.run);

        return run;
    }

    @Override
    public int getJump() {
        System.out.println("Cat - "+ name + " Jump " + this.jump);
        return 0;
    }
}
