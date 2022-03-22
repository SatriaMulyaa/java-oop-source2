public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        Person person2;
        person2 = new Person();
        person1.name = "ali";
        person1.address = "jakarta";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("reno");
        person2.sayHello("brack");
    }
}
