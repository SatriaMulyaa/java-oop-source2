class Manager {
    String name;
    String address;

    Manager(String name){
        this.name = name;
    }

    Manager(String name, String address){
        this.name = name;
        this.address = address;
    }

    void sayHello(String name){
        System.out.println("hello " + name + " my name is Manager " + this.name);
    }
}
