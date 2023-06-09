class Pitbull extends Dog{

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition()+3);
        System.out.println("Bergerak 3 kali ke kanan, posisi sekarang di" + getPosition()+ "langkah di kanan");
    }

    @Override
    void describe() {
        System.out.println("Panjang rata-rata Pitbull adalah" + getAverageLength() + "cm");
    }
    
}