class Parent {
    String name;
    void doit(){
        System.out.println("Do it in Parent");
    }
}

class Child extends Parent {
    String name;
    void doit(){
        System.out.println("Do it in Child");
        System.out.println("Parent name is " + super.name);
    }
}
