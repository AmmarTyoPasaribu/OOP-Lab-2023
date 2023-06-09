package assignment_06_00;

public class SiberianHusky extends Dog {

    @Override
    void move() {
        position += 2;
        System.out.println("siberian husky sedang berada pada posisi " + position);

    }

    @Override
    void describe() {
        System.out.println("Anjing Husky berjiwa bebas dan biasanya ramah kepada manusia");
    }
    
}
