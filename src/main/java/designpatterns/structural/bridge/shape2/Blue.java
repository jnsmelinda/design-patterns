package designpatterns.structural.bridge.shape2;

public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("apply blue");
    }
}