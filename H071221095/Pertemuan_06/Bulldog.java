class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition()+2);
        System.out.println("Bulldog berpindah ke kanan sebanyak " +getPosition()+ " langkah");
    }

    @Override
    void describe() {
        System.out.println("Berkaki Pendek");
    }
}
