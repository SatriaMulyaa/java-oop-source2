package programmer.zaman.now.data;

public class Application {

    public static final int PROCESSORS;
    static{
        System.out.println("ACCESS CLASS APPLICATION");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
