package designpatterns.creational.singleton;

public class ImmutableSingleton {
    private static final ImmutableSingleton INSTANCE = new ImmutableSingleton();

    private ImmutableSingleton() {
    }

    public static ImmutableSingleton getInstance() {
        return INSTANCE;
    }
}
