package designpatterns.creational.builder;

public class LunchOrderBeanDemo {
    public static void main(String[] args) {
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

//        lunchOrderBean.setBread("wheat");
//        lunchOrderBean.setCondiments("mayo");
//        lunchOrderBean.setMeat("ham");
//        lunchOrderBean.setTopping("lettuce");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getMeat());
        System.out.println(lunchOrderBean.getTopping());
    }
}
