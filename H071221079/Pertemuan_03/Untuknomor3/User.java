public class User {
    String nama;
    int uang;

    public User(String nama, int uang){
        this.nama=nama;
        this.uang=uang;
    }

    public String getNama() {
        return nama;
    }
    public int getUang() {
        return uang;
    }

    public static void tampilinUser(User user){
        System.out.println("-".repeat(18)+"Card"+"-".repeat(18));
        System.out.println(user.getNama());
        System.out.println(user.getUang());
        System.out.println("-".repeat(40));
    }
    
}
