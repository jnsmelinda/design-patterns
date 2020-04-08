package designpatterns.creational.factory;

import org.checkerframework.checker.units.qual.A;

public class Blog extends WebSite {

    @Override
    public void createWebsites() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
