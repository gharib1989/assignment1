package assignment.domain;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        UrlCounter urlCounter = new UrlCounter("https://www.youtube.com/watch?v=wCqO8Mp4tEc");
        urlCounter.countDomains();
        final Map<String, Integer> found = urlCounter.getDomainCount();
        System.out.println(found); 
    }
}
