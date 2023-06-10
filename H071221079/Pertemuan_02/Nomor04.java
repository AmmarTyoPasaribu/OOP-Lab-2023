public class Nomor04 {
    public static void main(String[] args) {
        Cuboid kCuboid = new Cuboid();
        kCuboid.length = 4500;
        kCuboid.width = 1;
        kCuboid.height = 1;
 
        System.out.printf("volume = %.2f", kCuboid.getVolume());
    }
}

class Cuboid {
    double length;
    double width;
    double height;

    double getVolume() {
        return length * width * height;
    }
}