package designpatterns.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        WebSite site = WebsiteFactory.getWebSite(WebsiteType.BLOG);
        System.out.println(site.getPages());
        site = WebsiteFactory.getWebSite(WebsiteType.BLOG);
        System.out.println(site.getPages());
    }
}
