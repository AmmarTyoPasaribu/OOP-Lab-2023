public class Product {
    private String name, expiryDate;
    private Object price;

    public Product(String name, String expiryDate, Object price) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public Object getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Susu", "01-01-2033", "$5");
        Product product2 = new Product("Keju", "01-01-1945", 3);
        Product product3 = new Product("Gula-gula", "never", 0.5);

        System.out.println("Product 1: " + product1.getName() + " - " + product1.getPrice() + " - "
                            + product1.getExpiryDate());
        System.out.println("Product 2: " + product2.getName() + " - " + product2.getPrice() + " - "
                + product2.getExpiryDate());
        System.out.println("Product 3: " + product3.getName() + " - " + product3.getPrice() + " - "
                + product3.getExpiryDate());
    }
}
