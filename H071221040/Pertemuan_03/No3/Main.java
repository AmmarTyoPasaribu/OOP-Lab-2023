package No3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Nakita", 1000000);

        Product laptop1 = new Product("HP Pavillion Gaming 15", "2000", 3);
        Product laptop2 = new Product("ASUS Vivobook 15", "4000", 4);
        Product laptop3 = new Product ("Lenovo IdeaPad S145", "145", 2);

        Store store = new Store("Sisfo Computer");
        //memasukkan nilai laptop 1 2 3 ke dalam fungsi addProduct
        store.addProduct(laptop1);
        store.addProduct(laptop2);
        store.addProduct(laptop3);
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        
        while (input != 0) {
            System.out.println("-----------CARD-----------");
            System.out.println(user.getNama());
            System.out.println(user.getBalance());
            System.out.println("--------------------------");
            System.out.println("Selamat Datang di Sisfo Computer");
            System.out.println("Daftar Produk :");
            store.ShowAll(); //memanggil fungsi ShowAll untuk menampilkan list product
            System.out.println("0. Keluar");
            System.out.print("> ");
            input = scanner.nextInt();

            if (input != 0) {
            
                int konfirmasiInput ; //variable input yang baru untuk membedakan inputan yg daftar produk dengan inputan berikutnya

                System.out.println("Apakah anda yakin inign membeli:");
                System.out.printf("%s dengan harga %s \n", store.getProducts().get(input - 1).getName(), store.getProducts().get(input -1).getPrice());
                System.out.println("1. Konfirmasi");
                System.out.println("2. Batal");
                System.out.print("> ");
                konfirmasiInput = scanner.nextInt();

                if (konfirmasiInput == 1) {
                    store.sell(user, input); // apabila dikonfirmasi, maka uang pembeli berkurang
                }

                
                System.out.println("--------------------------");
                System.out.println("Lanjutkan Transaksi?");
                System.out.println("1. Iya");
                System.out.println("2. Tidak");
                System.out.print("> ");
                konfirmasiInput = scanner.nextInt();

                if (konfirmasiInput == 2) {
                    input = 0; // apabila tidak, maka kode berhenti
                } //apabila input yang dimasukkan 0 maka kode berhenti dijalankan
            } 

        }
    scanner.close();
}
}
