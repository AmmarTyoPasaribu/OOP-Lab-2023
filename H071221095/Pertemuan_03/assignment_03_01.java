package Nomor1;

public class No1 {
    public static void main(String[] args) {
        Film filmIvanna = new Film("Ivanna", "Horror", "Tinggi" , 2022);
        filmIvanna.tampilkanDetail();
        // filmIvanna.rating();
        Film filmJohnWick = new Film("John Wick", "Action", "Tinggi"); 
        filmJohnWick.setYear(2023);
        filmJohnWick.tampilkanDetail();
    }
}
