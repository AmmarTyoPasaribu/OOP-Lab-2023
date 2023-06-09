class SiberianHusky extends Dog  {

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition()+2);
        System.out.println("Bergerak 2 kali ke kanan, posisi sekarang di" + getPosition()+ "langkah di kanan");
    }

    @Override
    void describe() {
        System.out.println("Panjang rata-rata Siberian Husky adalah" + getAverageLength() + "cm");
    }
    
}
