public class Book{
    private String title;
    private String author;
    private int yearPublished;
    private int price;

    public Book(){}
    public Book (String title, String author, int yearPublished, int price){
        this.title=title;
        this.author=author;
        this.yearPublished=yearPublished;
        this.price=price;
    }

    public void displayInfo(){
        System.out.println("Judul = "+getTitle());
        System.out.println("Author = "+getTitle());
        System.out.println("Tahun terbit = "+getYearPublished());
        System.out.println("Harga = "+getPrice());
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    

}