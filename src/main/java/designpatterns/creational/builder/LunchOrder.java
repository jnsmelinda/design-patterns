package designpatterns.creational.builder;

public class LunchOrder {
    public static class Builder {
        private String bread;
        private String meat;
        private String condiments;
        private String topping;

        public Builder() {
        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder toppings(String toppings) {
            this.topping = toppings;
            return this;
        }
    }

    private final String bread;
    private final String meat;
    private final String condiments;
    private final String topping;

    public LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.condiments = builder.condiments;
        this.topping = builder.topping;
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
