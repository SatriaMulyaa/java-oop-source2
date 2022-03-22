public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Satria");
        employee.sayHello("Budi");

        employee = new Manager("Satria", "jakarta");
        employee.sayHello("Budi");

        employee = new VicePresident("Satria");
        employee.sayHello("Budi");

        sayHello(new Employee("jiki"));
        sayHello(new Manager("jiko"));
        sayHello(new VicePresident("jike"));

    }

    static void sayHello(Employee employee){
        System.out.println("hallo " + employee.name) ;
    }
}
