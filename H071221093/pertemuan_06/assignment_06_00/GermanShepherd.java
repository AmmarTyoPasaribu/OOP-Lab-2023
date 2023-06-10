package assignment_06_00;

public class GermanShepherd extends Dog {

    @Override
    void move() {
        position += 3;
        System.out.println("german shepherd sedang berada pada posisi " + position);

    }

    @Override
    void describe() {
        System.out.println("Struktur tubuh yang agak memanjang, proporsional, berotot, dan memiliki struktur tulang yang solid.");
    }
    
}
