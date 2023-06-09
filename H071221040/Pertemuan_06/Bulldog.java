class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);

    }

    @Override
    void move() {
        setPosition(getPosition()+1);
        System.out.println("Bergerak 1 kali ke kanan, posisi sekarang di " + getPosition()+ " langkah di kanan");
    }

    @Override
    void describe() {
        System.out.println("Panjang rata-rata Bulldog adalah " + getAverageLength() + " cm");
    }
    
}
