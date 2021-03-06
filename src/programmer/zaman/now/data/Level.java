package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "AnimalApp", tags = {"applicatio", "java"})

public enum Level {
    STANDARD("Standard level"),
    PREMIUM("Premium level"),
    VIP ("VIP level"  );

    private String description;

     Level(String description){
         this.description = description;
     }

    public String getDescription() {
        return description;
    }
}
