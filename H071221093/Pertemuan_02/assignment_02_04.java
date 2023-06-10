class cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height*width*length;
    }

    public static void main(String[] args) {
        cuboid cuboid = new cuboid();

        cuboid.height = 5;
        cuboid.width = 30;
        cuboid.length = 30;
        System.out.printf("volume = %.2f", cuboid.getVolume());
    }
}
