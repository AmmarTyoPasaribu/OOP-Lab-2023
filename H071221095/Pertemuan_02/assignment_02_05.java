class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height*width*length;
    }
}

public class No4 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 15;
        cuboid.width = 12;
        cuboid.length = 25;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}