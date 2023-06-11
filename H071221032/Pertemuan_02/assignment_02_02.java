package H071221032.Pertemuan02;

class Person {
    String name;
    int age;
    boolean isMale;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        if(this.isMale) {
            return "Male";
        } else {
            return "Female";
        }
    }
}

public class assignment_02_02 {
    public static void main(String[] args) {
        Person azka = new Person();
        azka.setName("Azka");
        azka.setAge(19);
        azka.setGender(true);
        System.out.println("Hai, saya " + azka.getName() + " usia " + azka.getAge() + " tahun, dan saya adalah " + azka.getGender());

    }
}
