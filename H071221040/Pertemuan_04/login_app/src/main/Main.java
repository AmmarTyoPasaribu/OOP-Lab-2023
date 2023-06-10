import java.util.ArrayList;
import java.util.Scanner;


import models.Profile;
import models.User;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listProfile = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        int selectMenu = scanner.nextInt();
        scanner.nextLine();
        switch (selectMenu) {
            case 1:
                showLoginMenu();
                break;
            case 2:
                showRegisterMenu();
            default:
                runApp();
        }
    }

    public static void showLoginMenu(){
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan username");
        System.out.print("> ");
        String username = scanner.nextLine();

        int userIndex = -1 ;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i ;
                break;
            }
        }

        if (userIndex != 1) {
            System.out.println("Password");
            System.out.print("> ");
            String password = scanner.nextLine();
            
            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listProfile.get(userIndex));
                System.exit(0);
            } else {
                System.out.println("Password salah");                
            }
        }
    }
    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");
        System.out.println("Username");
        System.out.print("> ");
        String username = scanner.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = scanner.nextLine();

        User user = new User(username, password);

        Profile profile = new Profile();

        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = scanner.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = scanner.nextLine();

        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);

        listUser.add(user);
       
        profile.setNickName(StringUtils.generateNickName(fullName));
        
        listProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("Nama Lengkap\t: " + profile.getFullName());
        System.out.println("Nama Panggilan\t: " + profile.getNickName());
        System.out.println("Umur\t\t: " + profile.getAge());
        System.out.println("Hobby\t\t: " + profile.getHobby());
        System.out.println("-------------------------");
    }
}