import java.util.ArrayList;
import java.util.List;

class abc {
    String a;

    public abc(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

}

public class tes {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        
        arrayList.add("a"); //0
        arrayList.add("b"); //1
        arrayList.add("c"); //2
        arrayList.add("d"); //3

        arrayList.get(0); //a

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(0);
        arrayList.get(0); //b

        arrayList.size();

        List<abc> abcList = new ArrayList<>();

        abcList.add(new abc("asd"));

        abc ab = new abc("assdasd");
        abcList.add(ab);
    }
}
