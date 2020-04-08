package designpatterns.creational.singleton;

import java.io.File;

public enum EnumSingleton {
    INSTANCE("src/main/resources/test.txt");

    private final File file;

    private EnumSingleton(String path) {
        this.file = new File(path);
    }

    public File getFile() {
        return file;
    }
}
