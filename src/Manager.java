class Manager extends Employee {

    String address;

    Manager(String name){
        super(name);
    }

    Manager(String name, String address){
        super(name);
        this.address = address;
    }

    void sayHello(String name){
        System.out.println("hello " + name + " my name is Manager " + this.name);
    }
}
