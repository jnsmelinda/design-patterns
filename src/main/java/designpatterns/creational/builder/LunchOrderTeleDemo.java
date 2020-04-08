package designpatterns.creational.builder;

public class LunchOrderTeleDemo {
    public static void main(String[] args) {
        LunchOrderTele lunchOrderTele = new LunchOrderTele
            ("wheat", "ham", "mustard", "lettuce");

        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getMeat());
        System.out.println(lunchOrderTele.getCondiments());
        System.out.println(lunchOrderTele.getTopping());
    }
}
