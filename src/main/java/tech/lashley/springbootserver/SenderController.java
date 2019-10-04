package tech.lashley.springbootserver;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class SenderController {

    @RequestMapping("/feedbacksender")
    public String sender() {
        Feedback feedback = new Feedback();
        return feedback.getContent();
    }
    
}
