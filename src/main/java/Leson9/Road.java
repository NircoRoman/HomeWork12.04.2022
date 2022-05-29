package Leson9;

public class Road implements Mission{
    private int roadLength;
    public Road(int roadLength) {
        this.roadLength = roadLength;

    }

    @Override
    public int roadLength() {
        System.out.println("Road Length - "+roadLength);
        return roadLength;
    }

    @Override
    public int wallHeight() {

        return 0;
    }
}
