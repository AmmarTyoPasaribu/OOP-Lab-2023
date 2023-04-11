public class Nomor02 {


    public static void main(String[] args) {
        Person person = new Person();
        person.setName("nakits");
        person.setAge(19);
        person.setGender("Female");

        System.out.println("nama\t\t: " + person.getName());
        System.out.println("umur\t\t: " + person.getAge());
        System.out.println("Jenis kelamin\t: " + person.getGender());


    }
}

class Person {
    String name;
    int age;
    boolean isMale;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.isMale = gender == "Male";
    }

    public String getGender(){
        if (isMale) {
            return "Male";
         }
        else {
            return "Female";
        }

}
}