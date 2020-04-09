package designpatterns.structural.bridge.shape2;

public class Red implements Color {

    @Override
    public void applyColor() {
        System.out.println("apply red");
    }
}
