package assignment_06_00;

public class Pitbull extends Dog {

    @Override
    public
    void move() {
        position += 3;
        System.out.println("pitbull sedang berada pada posisi " + position);

    }

    @Override
    public
    void describe() {
    System.out.println("Anjing pitbull adalah ras anjing campuran yang memiliki bentuk tubuh besar, kepala persegi serta sifat yang galak");
    }
    
}
