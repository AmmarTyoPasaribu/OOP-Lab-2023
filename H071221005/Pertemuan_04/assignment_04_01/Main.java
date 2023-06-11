package H071221005.Pertemuan_04.assignment_04_01;

import java.util.ArrayList;
import java.util.Scanner;
import H071221005.Pertemuan_04.assignment_04_01.models.Profile;
import H071221005.Pertemuan_04.assignment_04_01.models.User;
import H071221005.Pertemuan_04.assignment_04_01.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static int userIndex = -1;

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        String selectMenu = sc.nextLine();
        switch (selectMenu) {
            case "1":
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case "2":
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
            // Halaman Login
            System.out.println("-------------------------");
            System.out.println("Login");
            // Menginput Username dan Menyimpannya di attribute username;
            System.out.println("Masukkan Username");
            System.out.print("> ");
            String username = sc.nextLine();
            if(listUser.isEmpty()){
                System.out.println("-------------------------");
                System.out.println("Registrasi Dahulu");
                showRegisterMenu();
            }
            // membuat variabel dengan tipedata boolean untuk menghentikan perulangan
            boolean cekUsername =true;
            
            // Membuat variabel userIndex yang mana nanti akan menampung index dari user
            for (int i = 0; i < listUser.size(); i++) {
                
                /*
                * Buatlah sebuah perkondisian (IF) yang akan
                * Mengecek apakah user index ke i dari listUser memiliki username yang sama
                * dengan username yang
                * diinput.
                * Jika ada, ganti userIndex dengan Index dari User Tersebut, kemudian hentikan
                * perulangan
                */
                // Melakukan perulangan while ketika username tidak ditemukan dan akan meminta input ulang.
                    if(listUser.get(i).getUsername().equals(username)){
                        userIndex = i;
                        cekUsername = false;
                        break;
                    }
                }
            // Melakukan perulangan while untuk kondisi ketika username tidak ada
            while(cekUsername){
                System.out.println("-------------------------");    
                System.out.println("Username Tidak Ditemukan");
                System.out.println("-------------------------");        
                System.out.println("Masukkan Username");
                System.out.print("> ");
                username = sc.nextLine();
                for (int j = 0; j < listUser.size(); j++) {
                    if(listUser.get(j).getUsername().equals(username)){
                        userIndex = j;
                        cekUsername = false;
                    }
                }
            }
            
            // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
            boolean isPasswordMatch = true; 
            if (userIndex != -1) {
                // Menginput Password
                System.out.println("Password");
                System.out.print("> ");
                String password = sc.next();

                /*
                * 
                * Mengecek apakah password dari User yang login berdasarkan username
                * sama dengan password yang diinput sebelumnya, kemudian simpan
                * hasilnya di variabel isPasswordMatch
                */
                
                // Jika passwordnya sama maka berhasil login
                if(listUser.get(userIndex).getPassword().equals(password)){
                    // isPasswordMatch = false;
                    if (isPasswordMatch) {
                    System.out.println("Berhasil Login");
                    /*
                    * panggil method showDetailUser dan kirimkan data Profile User yang login
                    * 
                    */
                    showDetailUser();
                    System.exit(0);
                    }
                }else{
                    // Mengecek apakah username yang diinput apakah sesuai dengan password yang diinput 
                    boolean cekPassword = true;
                    while(cekPassword){
                    System.out.println("-------------------------");    
                    System.out.println("Password Salah");
                    System.out.println("-------------------------");        
                    System.out.println("Masukkan Password");
                    System.out.print("> ");
                    password = sc.next();
                    if(listUser.get(userIndex).getPassword().equals(password)){
                        cekPassword = false;
                        showDetailUser();
                        System.exit(0);
                    }
                }
            }
        }
    }
        

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");
        
        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        // Jika inputan username kosong,akan diminta input ulang
        while(username.isEmpty()) {
            System.out.println("-------------------------");
            System.out.println("Username harus diisi");
            System.out.println("-------------------------");
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
        }
        // Jika username telah dipakai,maka akan diminta input ulang.
        for (int i = 0; i < listUser.size(); i++) {
            while(username.equals(listUser.get(i).getUsername())){
                System.out.println("-------------------------");    
                System.out.println("Username Telah Dipakai");
                System.out.println("-------------------------");
                System.out.println("Username");
                System.out.print("> ");
                username = sc.nextLine();
            }
        }
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        // Jika inputan password kosong,akan diminta input ulang
        while(password.isBlank()) {
            System.out.println("-------------------------");
            System.out.println("Password harus diisi");
            System.out.println("-------------------------");
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            // Aturan Password
            while(password.isBlank() == false){
                if(password.length() < 8){
                System.out.println("-------------------------");
                System.out.println("Password harus lebih dari 8 huruf");
                System.out.println("-------------------------");
                System.out.println("Password");
                System.out.print("> ");
                password = sc.nextLine();

                }else{
                    break;
                }
        
            }
        }
       
        
        /*
         * Buatlah atau Instance objek User baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance User
         */
        User user = new User(username, password);
        
       
         // Menginput Data Profile
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        
        // Jika inputan fullName kosong,akan diminta input ulang
        while(fullName.equals("")) {
            System.out.println("-------------------------");
            System.out.println("Nama Lengkap harus diisi");
            System.out.println("-------------------------");
            System.out.println("Nama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine();
            
        }
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        System.out.println("Hobby");
        System.out.print("> ");
        sc.nextLine();
        String hobby = sc.nextLine();
        
        // Jika inputan hobby kosong,akan diminta input ulang
        while(hobby.isEmpty()) {
            System.out.println("-------------------------");
            System.out.println("Hobby harus diisi");
            System.out.println("-------------------------");
            System.out.println("Hobby");
            System.out.print("> ");
            hobby = sc.nextLine();
        }
        /*
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */
        Profile profile = new Profile(fullName, hobby, age);
        
         /*
         * Berikan nilai nickName ke objek profile,
         * Nilai ini diperoleh menggunakan static method yang dibuat di class
         * StringUtils, dengan mengirimkan fullName yang diinput sebelumnya
         */
        String nickName = StringUtils.nickName(profile);
        profile.setNamapanggilan(nickName);

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
       
    }
    private static void showDetailUser() {
        /*
         * Tampilkan semua data profile user yang login
         */
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-------------------------");
        System.out.printf("Nama Lengkap    : %s\n",listUserProfile.get(userIndex).getNamalengkap());
        System.out.printf("Nama Panggilan  : %s\n",listUserProfile.get(userIndex).getNamapanggilan());
        System.out.printf("Umur            : %d\n",listUserProfile.get(userIndex).getUmur());
        System.out.printf("Hobby           : %s\n",listUserProfile.get(userIndex).getHobby());
    }
}
