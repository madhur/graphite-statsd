package example.statsd;

import com.timgroup.statsd.NonBlockingStatsDClient;
import com.timgroup.statsd.StatsDClient;

public class App {

    private static final StatsDClient statsd = new NonBlockingStatsDClient("java.statsd.example.prefix", "localhost", 8125);

    public static void main(String[] args) {
        statsd.incrementCounter("java_main_method_counter");
        statsd.time("java_method_time", 125L);

        statsd.stop();
    }
}
