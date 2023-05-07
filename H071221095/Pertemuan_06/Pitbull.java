class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition()+3);
        System.out.println("Pitbull berpindah ke kanan sebanyak " +getPosition()+ " langkah");
    }

    @Override
    void describe() {
        System.out.println("Bentuk Kepala Persegi");
    }
    
}
