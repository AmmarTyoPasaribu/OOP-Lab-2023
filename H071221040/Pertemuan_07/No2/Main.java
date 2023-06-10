public class Main {
    public static void main(String[] args) {
        Product<Integer> kinderjoy = new Product<>("Kinderjoy", 10000, "2023-05-01");
        Product<String> sariRoti = new Product<>("Sari Roti", "Rp 15.00", "2023-05-20");
        Product<Double> susuKurma = new Product<>("Susu Kurma", 7.5, "2023-06-01");

        System.out.println(kinderjoy.getNama() + " - " + kinderjoy.getHarga() + " - " + kinderjoy.getExpire());
        System.out.println(sariRoti.getNama() + " - " + sariRoti.getHarga() + " - " + sariRoti.getExpire());
        System.out.println(susuKurma.getNama() + " - " + susuKurma.getHarga() + " - " + susuKurma.getExpire());
    }
}
