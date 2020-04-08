package designpatterns.creational.prototype;

import designpatterns.creational.prototype.Item;

public class Movie extends Item {

    private String runTime;

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }
}
