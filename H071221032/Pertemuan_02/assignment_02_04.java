package H071221032.Pertemuan02;

class Cuboid {
    double height;
    double width;
    double lenght;

    double getVolume() {
        double volume = height * width * lenght;
        return volume;
    }
}

public class assignment_02_04 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 15;
        cuboid.width = 30;
        cuboid.lenght = 10;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}