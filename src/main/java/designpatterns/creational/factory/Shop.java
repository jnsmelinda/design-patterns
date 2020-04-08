package designpatterns.creational.factory;

public class Shop extends WebSite {
    @Override
    public void createWebsites() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
