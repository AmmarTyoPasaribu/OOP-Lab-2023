class Person {
    String name; //atribut
    int age;
    boolean isMale;

    public void setName (String name) { //string name itu parameter
        this.name = name; //this spy bs diakses dgn nama yg sama, utk mengakses object saat ini
    }
    public String getName () {
        return name;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public int getAge () {
        return age;
    }
    public void setGender (String gender) {
        this.isMale = gender == "male";
    }
    public String getGender () {
        if (isMale) {
            return "male";

        } else{
            return "female";
        }
    }
}

public class No2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("salsaaa");
        person.setAge(18);
        person.setGender("female");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}
