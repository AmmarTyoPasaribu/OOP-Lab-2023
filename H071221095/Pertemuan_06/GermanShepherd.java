class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition()+2);
        System.out.println("German Shepherd berpindah ke kanan sebanyak " +getPosition()+ " langkah");
    }

    @Override
    void describe() {
        System.out.println("Telinga Berdiri Tegak");
    }
}