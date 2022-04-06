package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Car", tags = {"applicatio", "java"})

public interface Car extends HashBrand,IsMaintenance{
    void drive();
    int getTire();
    default boolean isBig(){
        return false;
    }
}
