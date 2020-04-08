package designpatterns.creational.factory;

public class WebsiteFactory {
    public static WebSite getWebSite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG : {
                return new Blog();
            }
            case SHOP : {
                return new Shop();
            }
            default:{
                return null;
            }
        }
    }
}
