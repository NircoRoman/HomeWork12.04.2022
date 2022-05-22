package Leson6;

public class Animals {
    protected String type;
    protected String name;
    protected int swim;
    protected int run;
    private static int Count;
    public static int getCount(){
        return Count;
    }

   public void printf(){
        System.out.println(this.type + " - " + this.name);
    }

    protected void run(int distance) {
        if (run >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "  - УСПЕШНО пробежал(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- сошел(а) с дистанции ---- ");
        }
    }

    protected void swim(int distance) {
        if (swim >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "   - УСПЕШНО проплыл(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- не выполнил норматив ---- ");
        }
    }


}
