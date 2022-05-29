package Leson9;

public class Wall implements Mission{
    private int wallHeight;
    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public int roadLength() {
        return 0;
    }

    @Override
    public int wallHeight() {
        System.out.println("Wall Height - " + wallHeight);
        return wallHeight;
    }
}
