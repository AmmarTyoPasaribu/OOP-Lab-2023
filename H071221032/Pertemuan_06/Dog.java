public abstract class Dog {
    int position;
    int averageLength;

    public Dog(int pos, int avgLenght) {
        this.position = pos;
        this.averageLength = avgLenght;
    }

    public abstract void move();

    public abstract void describe();
}

