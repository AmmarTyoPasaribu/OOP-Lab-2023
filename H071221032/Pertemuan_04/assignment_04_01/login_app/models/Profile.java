package No1.login_app.models;

public class Profile {
    public String fullName, hobby, nickName;
    public int age;
    public Profile(String fullName, String hobby, int age) {
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
    }
    public Profile(String fullName, String hobby, int age, String nickName) {
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickName = nickName;
    }
    /*
     * TODO: done
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
}
