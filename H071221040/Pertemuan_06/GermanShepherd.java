class GermanShepherd extends Dog {

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition()+3);
        System.out.println("Bergerak 3 kali ke kanan, posisi sekarang di" + getPosition()+ "langkah di kanan");
    }

    @Override
    void describe() {
        System.out.println("Panjang rata-rata German Shepherd adalah" + getAverageLength() + "cm");
    }
    
}
