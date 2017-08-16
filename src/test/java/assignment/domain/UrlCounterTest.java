package assignment.domain;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UrlCounterTest {

    @Test
    public void countDomains() throws Exception {
        final Map<String, Integer> expected = new HashMap<>(5);
        expected.put("dajsygnal.pl", 1);
        expected.put("pogodnie.pl", 1);
        expected.put("wawalove.pl", 325);
        expected.put("onas.o2.pl", 1);
        expected.put("film.wp.pl", 1);

        UrlCounter urlCounter = new UrlCounter("http://wawalove.pl");
        urlCounter.countDomains();
        final Map<String, Integer> found = urlCounter.getDomainCount();

        System.out.println(found);
    }

}