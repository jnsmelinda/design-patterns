package designpatterns.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("This is an example ");
        sb.append("of the builder pattern. ");
        sb.append("It has method to append ");
        sb.append("We want to a String. ");
        sb.append(42);
        System.out.println(sb.toString());
    }
}
