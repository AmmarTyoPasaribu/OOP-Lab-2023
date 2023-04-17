import java.util.Scanner;

public class runNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ID produk: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Masukkan nama produk: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan stok produk: ");
        int stock = scanner.nextInt();

        System.out.print("Masukkan harga produk: ");
        double price = scanner.nextDouble();

        No3 product = new No3(id, name, stock, price);

        System.out.println("\nInformasi Produk:");
        System.out.println("ID Produk: " + product.getId());
        System.out.println("Nama Produk: " + product.getName());
        System.out.println("Stok Produk: " + product.getStock());
        System.out.println("Harga Produk: " + product.getPrice());

        if (product.isAvailable()) {
            System.out.println("Produk tersedia di stok.");
        } else {
            System.out.println("Produk tidak tersedia di stok.");
        }
        scanner.close();
    }
}
