public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Satria","jakarta");
        Person person2;
        person2 = new Person("udin","bandung");

        person1.address = "jakarta";

        Person person3 = new Person();
        Person person4 = new Person("kevin");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        System.out.println(person4.name);

        person1.sayHello("reno");
        person2.sayHello();
    }
}
