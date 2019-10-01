package tech.lashley.springbootserver;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@EnableAutoConfiguration
@RestController
public class SenderController {

    private final AtomicLong counter = new AtomicLong();
    @RequestMapping("/")
    public String sender() {
        Feedback feedback = new Feedback(counter.get());
        return feedback.getContent();
    }
    
}
