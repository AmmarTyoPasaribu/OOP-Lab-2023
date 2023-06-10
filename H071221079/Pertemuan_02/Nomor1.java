class Burung{
    String jenis;
    String warna;
    String suara;
    
    public static void berjalan() {
        System.out.println("burung berjalan");
        
    }
    public String makan() {
        return jenis + " makan";
    }
}
public class Nomor1{
    public static void main(String[] args) {
        Burung burungBeo = new Burung();
        burungBeo.jenis = "Beo";
        burungBeo.warna = "merah";
        burungBeo.suara = "berkicau";

        System.out.println(burungBeo.makan());

        
    }

}