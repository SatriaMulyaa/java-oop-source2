package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        try{
            connectDatabase("satria","satria");
            System.out.println("success");
        }catch(DatabaseError error){
            System.out.println("Error " + error.getMessage());
        }
    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("can't connect to Database");
        }
    }
}
