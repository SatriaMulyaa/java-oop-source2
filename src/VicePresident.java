class VicePresident extends Manager {
    void sayHello(String name){
        System.out.println("hello " + name + " my name is VP " + this.name);
    }

    VicePresident(String name){
        super(name, null);
    }
}
