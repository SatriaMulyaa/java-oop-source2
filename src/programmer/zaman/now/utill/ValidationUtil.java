package programmer.zaman.now.utill;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.BlankException;
import programmer.zaman.now.error.ValidationException;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest)throws ValidationException, NullPointerException {
        if(loginRequest.username() == null){
            throw new NullPointerException("username is null ");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("username is isBlank ");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("password is null ");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationException("password is isBlank ");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest){
        if(loginRequest.username() == null){
            throw new NullPointerException("username is null ");
        }else if(loginRequest.username().isBlank()){
            throw new BlankException("username is isBlank ");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("password is null ");
        }else if(loginRequest.password().isBlank()){
            throw new BlankException("password is isBlank ");
        }
    }


}
