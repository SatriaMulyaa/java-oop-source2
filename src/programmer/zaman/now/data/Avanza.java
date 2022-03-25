package programmer.zaman.now.data;

public class Avanza implements Car{

    public void drive() {
        System.out.println("Avanza Drive");
    }
    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
