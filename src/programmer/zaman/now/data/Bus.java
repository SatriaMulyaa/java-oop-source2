package programmer.zaman.now.data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Bus Drive");
    }


    public int getTire() {
        return 8;
    }


    public String getBrand() {
        return "Hino";
    }


    public boolean isMaintenance() {
        return false;
    }
}
