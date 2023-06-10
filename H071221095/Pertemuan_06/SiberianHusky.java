class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition()+2);
        System.out.println("Siberian Husky berpindah ke kanan sebanyak " +getPosition()+ " langkah");
    }

    @Override
    void describe() {
        System.out.println("Berbulu tebal");
    }
}
