package designpatterns.structural.bridge.shape2;

import java.awt.*;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
