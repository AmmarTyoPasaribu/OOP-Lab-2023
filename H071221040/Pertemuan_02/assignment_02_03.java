class Product {
    public String id;
    public String name;
    public int stock;
    public double harga;

    public boolean isAvailable() {
        return this.stock > 0;
      }
}

public class Nomor03 {
    public static void main(String[] args) {
      Product product1 = new Product();
      Product product2 = new Product();
  
      product1.id = "P0001";
      product1.name = "Roti Sobek";
      product1.stock = 100;
      product1.harga = 12000;
  
      System.out.println("Product stock: " + product1.stock);
      System.out.println(product1.isAvailable());
      
      product1.stock = 0;
      
      System.out.println("Product stock: " + product1.stock);
      System.out.println(product1.isAvailable());

      product2.id = "P0002";
      product2.name = "Roti Tawar";
      product2.stock = 100;
      product2.harga = 12000;
  
      System.out.println("Product stock: " + product2.stock);
      System.out.println(product2.isAvailable());
      
      product2.stock = 0;
      
      System.out.println("Product stock: " + product2.stock);
      System.out.println(product2.isAvailable());
    }
  }