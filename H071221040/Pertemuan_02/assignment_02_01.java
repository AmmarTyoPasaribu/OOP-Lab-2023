class namaBrand {
    String namaBrand;
    String penemu;
    int tahun;

    public String getNama(){
        return namaBrand;
    }

    public String getfounder(){
        return penemu;
    }

    public int getyear(){
        return tahun;
    }

}

public class Nomor01 {
    public static void main(String[] args) {
        namaBrand namaBrand = new namaBrand();
    
        namaBrand.namaBrand = "Dior";
        namaBrand.penemu = "Christian Dior";
        namaBrand.tahun = 1947;

        System.out.println("Nama brand : " + namaBrand.getNama() + ".");
        System.out.println("Penemu : " + namaBrand.getfounder()+ ".");
        System.out.println("Tahun : " + namaBrand.getyear()+".");

    }

}