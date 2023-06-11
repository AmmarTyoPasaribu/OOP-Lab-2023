public class Main {
    public static void main(String[] args) {
        Product<Integer> p1 = new Product<>("Roti", 10000, "2023-05-01");
        Product<String> p2 = new Product<>("Indomie", "Rp 15.000", "2023-05-20");
        Product<Double> p3 = new Product<>("Bearbrand", 7.5 , "2023-06-01");

        System.out.print("Product 1 : "+p1.getProduk()+" - "+p1.getHarga()+" - "+p1.getTanggalKadaluarsa());
        System.out.print("\nProduct 2 : "+p2.getProduk()+" - "+p2.getHarga()+" - "+p2.getTanggalKadaluarsa());
        System.out.print("\nProduct 3 : "+p3.getProduk()+" - "+p3.getHarga()+" - "+p3.getTanggalKadaluarsa());
    }
}
