package H071221005.Pertemuan_04.assignment_04_01.utils;
import H071221005.Pertemuan_04.assignment_04_01.models.Profile;

public class StringUtils {
    /*
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */
    public static String nickName(Profile profil) {
        String nickname = "";
        
        String cek[] = profil.getNamalengkap().split(" ");
        if(cek.length == 0){
            nickname += cek[0];
        }else{
            nickname += cek[1];
        }
        return nickname;
    }
}    
