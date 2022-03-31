public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Satria");
        employee.sayHello("Budi");
//        Manager manager = new Manager("rudi");
        employee = new Manager("Satria", "jakarta");
        employee.sayHello("Budi");

        employee = new VicePresident("Satria");
        employee.sayHello("Budi");

        sayHello(new Employee("joki"));
        sayHello(new Manager("jiko"));
        sayHello(new VicePresident("jike"));

//        System.out.println(manager instanceof Employee);
//        System.out.println(employee instanceof Manager);
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("hallo  " + vicePresident.name) ;
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("hallo Manager " + manager.name) ;
        }else{
            System.out.println("hallo Employee " + employee.name) ;
        }
     }
}

