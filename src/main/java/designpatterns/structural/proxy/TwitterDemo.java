package designpatterns.structural.proxy;

public class TwitterDemo {
    public static void main(String[] args) {

//        The example only demonstrates the pattern. It doesn't work, because the service access information have to be unique.
//        The example is based on pluralsight.com/library/courses/design-patterns-java-structural.
        TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeline("bh5k"));

        service.postToTimeline("bh5k", "Some message that shouldn't go through.");
    }
}
