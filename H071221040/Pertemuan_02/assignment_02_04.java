class Cuboid {
    double height;
    double width;
    double length;
  
    double getVolume() {
      return length * width * height;
    }
  }
  
  public class Nomor04 {
    public static void main(String[] args) {
      Cuboid cuboid = new Cuboid();
  
      cuboid.width = 45.0;
      cuboid.height = 10.0;
      cuboid.length = 10.0;
  
      System.out.printf("Volume = %.2f\n", cuboid.getVolume());
    }
  }
  