package designpatterns.creational.builder;

public class LunchOrderTele {

    private String bread;
    private String meat;
    private String condiments;
    private String topping;

    public LunchOrderTele(String bread) {
        this.bread = bread;
    }
    public LunchOrderTele(String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
    }

    public LunchOrderTele(String bread, String meat, String condiments) {
        this.bread = bread;
        this.meat = meat;
        this.condiments = condiments;
    }

    public LunchOrderTele(String bread, String meat, String condiments, String topping) {
        this.bread = bread;
        this.meat = meat;
        this.condiments = condiments;
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
