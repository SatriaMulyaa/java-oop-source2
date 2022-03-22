public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Satria");
        System.out.println(manager.name);
        manager.sayHello("jerry");

       var vicePresident = new VicePresident("jery");
       System.out.println(vicePresident.name);

       vicePresident.sayHello("SIR");
    }
}
