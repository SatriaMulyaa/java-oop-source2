package programmer.zaman.now.data;

public record LoginRequest(String username, String password) {

    public LoginRequest{
        System.out.println("make the object LoginRequest");
    }

    public LoginRequest(String username){
        this("satria", " ");
    }

    public LoginRequest(){
        this(" "," ");
    }
}
