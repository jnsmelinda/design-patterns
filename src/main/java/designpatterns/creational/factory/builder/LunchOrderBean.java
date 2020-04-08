package designpatterns.creational.factory.builder;

public class LunchOrderBean {
    private String bread;
    private String meat;
    private String condiments;
    private String topping;

    public LunchOrderBean() {
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getTopping() {
        return topping;
    }
}
