package singleton;

public class BasicSingleton {
    private static volatile BasicSingleton instance;
    private BasicSingleton() {};

    public static BasicSingleton getInstance() {
        if(instance==null) {
            synchronized (BasicSingleton.class) {
                if(instance == null) {
                    instance = new BasicSingleton();
                }
            }
        }
        return instance;
    }
    public void printNameofFruit() {
        System.out.println("Name of fruit is Mango");
    }
}
