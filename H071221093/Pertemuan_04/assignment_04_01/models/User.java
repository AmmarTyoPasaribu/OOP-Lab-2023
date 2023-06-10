package login_app.models;

public class User {
    // membuat atribut
    private String username;
    private String password;
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    
     //membuat constructor
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    // setter dan getter dari atribut
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
