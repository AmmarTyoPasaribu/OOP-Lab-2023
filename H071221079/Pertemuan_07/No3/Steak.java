public class Steak implements Food{
    private int harga = 20;

    @Override
    public int getPrice() {
        return harga;
    }
}