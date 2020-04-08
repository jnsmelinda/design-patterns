package designpatterns.creational.factory.singleton;

public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create.");
        }
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }
}
