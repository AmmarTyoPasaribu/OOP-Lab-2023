class Mobil { //class
    String merk; //atribut
    String warna;
    int harga;

    public String getMerk () {
        return merk;
    }

    public String getWarna () {
        return warna;
    }

    public int getHarga () {
        return harga;
    }

}

public class No1 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.merk = "Honda Brio";
        mobil.warna = "Hitam";
        mobil.harga = 300000000;

        System.out.println("Merk Mobil: " + mobil.getMerk());
        System.out.println("Warna Mobil: " + mobil.getWarna());
        System.out.printf("Harga Mobil: " + mobil.getHarga());
    }
}