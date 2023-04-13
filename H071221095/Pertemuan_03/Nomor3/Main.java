package Nomor3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User ("Salsaaa", 10000);
        Product product = new Product ("Buku", "5000", 5);
        Product product1 =  new Product ("Pulpen", "3000", 8);
        Product product2 = new Product ("Pensil", "1000", 4);
        Store store = new Store("Toko Salsa");
        store.addProduct(product);
        store.addProduct(product1);
        store.addProduct(product2);
        

        Scanner scanner = new Scanner(System.in); //utk menerima inputan dr terminal
        int inp = 1;

        while (inp != 0) {
            System.out.println("--------CARD--------");
            System.out.println(user.getName());
            System.out.println(user.getBalance());
            System.out.println("---------------------");
            System.out.println("Selamat Datang di Toko Salsa");
            System.out.println("Daftar Produk: ");
            store.tampilkanProduct();
            System.out.println("0. Keluar");
            System.out.print("> ");

            inp = scanner.nextInt();
            if (inp != 0) {
                int konfirmasiInp;
                System.out.println("Apakah Anda Yakin Ingin Membeli: ");
                System.out.printf("%s, dengan harga %d \n", store.getProducts().get(inp-1).getName(), store.getProducts().get(inp-1).getPrice());
                System.out.println("1. Konfirmasi");
                System.out.println("2. Batal");
                System.out.print("> ");
                konfirmasiInp = scanner.nextInt();
                if (konfirmasiInp == 1) {
                    store.tampilkanTransaksi(user, inp);
                }

                System.out.println("----------------------");
                System.out.println("Lanjutkan Transaksi? ");
                System.out.println("1. Iya");
                System.out.println("2. Tidak");
                System.out.print("> ");
                konfirmasiInp = scanner.nextInt();
                if (konfirmasiInp == 2) {
                    inp = 0; //spyberhenti
                }

        
            } 
        }
        scanner.close();

    }
}
