package programmer.zaman.now.application;

import programmer.zaman.now.data.CreateUserRequest;
import programmer.zaman.now.utill.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args)  {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("satria");

        ValidationUtil.validationReflection(request);
    }
}
