package designpatterns.creational.factory.singleton;

import java.io.IOException;

public class SingletonDemo {

    public static void main(String[] args) throws IOException {
        ImmutableSingleton is1 = ImmutableSingleton.getInstance();
        ImmutableSingleton is2 = ImmutableSingleton.getInstance();
        System.out.println(is1);
        System.out.println(is2);


        LazySingleton ls1 = LazySingleton.getInstance();
        LazySingleton ls2 = LazySingleton.getInstance();
        System.out.println(ls1);
        System.out.println(ls2);

        EnumSingleton es1 = EnumSingleton.INSTANCE;
        EnumSingleton es2 = EnumSingleton.INSTANCE;
        System.out.println(Integer.toHexString(System.identityHashCode(es1)));
        System.out.println(Integer.toHexString(System.identityHashCode(es2)));
    }
}
