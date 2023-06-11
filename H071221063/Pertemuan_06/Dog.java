public abstract class Dog implements Move{
    int position;
    int averageLength;

    public Dog(int position, int averageLength){
        this.position = position;
        this.averageLength = averageLength;
    }
    public abstract void movement();
    public abstract void describe();

}
