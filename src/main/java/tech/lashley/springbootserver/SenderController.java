package tech.lashley.springbootserver;

import org.json.simple.JSONObject;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class SenderController {
    Feedback feedback = new Feedback();

    @RequestMapping("/feedbacksender")
    public String feedbackSender() {
        return feedback.getFeedback();
    }
    
    @RequestMapping("/resume")
    public String resumeSender() {
        return feedback.getResume();
    }
    
    @RequestMapping(value="/resumeJSON", produces="application/json")
    public JSONObject jsonResume() {
        return feedback.getJSONResume();
    }
}
