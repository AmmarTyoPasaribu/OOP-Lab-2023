package assignment_06_00;

public class Bulldog extends Dog {

    @Override
    void move() {
        position += 1;
        System.out.println("bulldog sedang berada pada posisi " + position);
    }

    @Override
    void describe() {
        System.out.println("Ras Bulldog memiliki tubuh yang pendek, kokoh dan kulit yang lentur, terutama di bagian kepala, leher dan bahu");
    }
    
}
