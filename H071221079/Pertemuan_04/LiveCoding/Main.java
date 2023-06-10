
public class Main {
    public static void main(String[] args) {
        Book book=new Book();
        book.setTitle("Bumi");
        book.setAuthor("Tere Liye");
        book.setPrice(987654321);
        book.setYearPublished(1);


        book.displayInfo();
        System.out.println("\n");

        Book booklagi=new Book("Bulan","TereLiye",123456789,10);
        System.out.println("judul = "+booklagi.getTitle());
        System.out.println("author = "+booklagi.getAuthor());
        System.out.println("tahun terbit = "+booklagi.getYearPublished());
        System.out.println("harga = "+booklagi.getPrice());
        
        SelfUtils.DISPLAYsELF();
    }
}
