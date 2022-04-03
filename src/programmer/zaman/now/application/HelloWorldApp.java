package programmer.zaman.now.application;


import programmer.zaman.now.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld(){

            public void sayHello() {
                System.out.println("hello");
            }


            public void sayHello(String name) {
                System.out.println("hello "+ name);

            }
        };

        HelloWorld indonesia = new HelloWorld(){

            public void sayHello() {
                System.out.println("hallo");
            }


            public void sayHello(String name) {
                System.out.println("hallo "+ name);

            }
        };

        english.sayHello();
        english.sayHello("sat");
        indonesia.sayHello();
        indonesia.sayHello("sat");

    }
}
