import java.util.ArrayList;
import java.util.List;

class A {
    String nama;

    public A(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

public class test {
    public static void main(String[] args) {
        ArrayList<A> arr = new ArrayList<A>();

        // Cara 1 Menambah objek ke arraylist
        A objekA = new A("asd");
        arr.add(objekA); // Index 0

        // Cara 2 Menambah objek ke arraylist
        arr.add(new A("asdaff")); // Index 1

        arr.get(0); // a

        arr.remove(0);
    }
}
