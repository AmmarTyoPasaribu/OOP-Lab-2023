package H071221032.Pertemuan02;

class Toko {
    String namaProduk, idProduk;
    int stokProduk, hargaProduk;

    public void cekData() {
        System.out.println("Nama Produk: " + namaProduk + "\nID Produk: " + idProduk + "\nStok Produk: " + stokProduk + "\nHarga Produk: " + hargaProduk);
    }

    public void cekStok() {
        if(stokProduk > 0) {
            System.out.println("Stok tersedia");
        }
        else {
            System.out.println("Stok tidak tersedia");
        }
    }
}

public class assignment_02_03 {
    public static void main(String[] args) {
        Toko tes = new Toko();
        tes.stokProduk = 1;
        tes.hargaProduk = 3;
        tes.idProduk = "1231diju";
        tes.namaProduk = "masako";

        tes.cekStok();
    }
}
