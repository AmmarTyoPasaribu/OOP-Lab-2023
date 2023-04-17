public class Employee {
    private String name;
    private int id;
    private String position;
    private int age;
    private int salery;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalery() {
        return salery;
    }
    public void setSalery(int salery) {
        this.salery = salery;
    }
    //behavior
    public void displayInfo(){
        System.out.println("Nama: "+ name);
        System.out.println("Id: "+ id);
        System.out.println("Posisi: "+ position);
        System.out.println("Umur: "+ age);
        System.out.println("jumlahGaji: "+ salery);
    }
    //constructor
    public Employee (String name, int id, String position, int age, int salery){
        this.name = name;
        this.id = id;
        this.position = position;
        this.age = age;
        this.salery = salery;
    }
    // constructor kosong
    public Employee (){
        
    }
    
}
