public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("nakits");
        employee.setId(1);
        employee.setPosition("manager");
        employee.setAge(19);
        employee.setSalery(1000000);
        employee.displayInfo();

        Employee employee2 = new Employee("sal", 2, "staff", 19,500000);
        System.out.println("Nama: "+ employee2.getName());
        System.out.println("Id: "+ employee2.getId());
        System.out.println("Posisi: "+employee2.getPosition());
        System.out.println("Umur: "+ employee2.getAge());
        System.out.println("jumlahGaji: "+ employee2.getSalery());
        SelfUtils.displaySelfData();


    }
}
