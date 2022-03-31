package programmer.zaman.now.data;

public interface Car extends HashBrand,IsMaintenance{
    void drive();
    int getTire();
    default boolean isBig(){
        return false;
    }
}
