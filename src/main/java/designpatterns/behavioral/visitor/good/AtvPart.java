package designpatterns.behavioral.visitor.good;

public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
