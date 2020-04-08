package designpatterns.creational.prototype;

import designpatterns.creational.prototype.Item;

public class Book extends Item {
    private int numOfPages;

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
}
