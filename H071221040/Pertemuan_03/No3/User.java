package No3;

public class User {
    String name;
    int balance;

    //getter
    public String getNama() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    
    //constructor
    public User(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
