import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ammar",9999999);
        Produk pisang = new Produk("pisang", 1, 1);
        Produk mangga = new Produk("mangga", 2, 10000);
        Produk apel = new Produk("apel", 3, 10000);
        Store tokoMar = new Store("tokoMar");
        Scanner input = new Scanner(System.in);
        tokoMar.tambahkanProduk(pisang);
        tokoMar.tambahkanProduk(mangga);
        tokoMar.tambahkanProduk(apel);

        while (true){
        User.tampilinUser(user);
        tokoMar.tampilkanProduk();     
        System.out.print("> ");
        
        Integer pilihan = input.nextInt();
        if (pilihan>0 && pilihan<=tokoMar.products.size()){
            System.out.println("Apakah anda yakin ingin membeli: ");
            Produk product = tokoMar.products.get((pilihan-1));
            System.out.println(product.getNama()+" , dengan harga "+product.getHarga());
            System.out.println(">1 Iya");
            System.out.println(">2 Tidak");
            Integer pilihan2 = input.nextInt();
            if(pilihan2==1){
                tokoMar.transaksi(user ,product); 
            } 
            else if(pilihan==2){
                break;
            }
            else{
                System.out.println("input yang bener cuy");
            }
            } 
        else {
            System.out.println("Makasih belanja");
            break   ; 
            }
        }
            input.close();
    }

}   

