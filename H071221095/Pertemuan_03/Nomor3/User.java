package Nomor3;
public class User {
    String name;
    int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
}
