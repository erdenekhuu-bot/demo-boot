package mn.erdenee.course.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/")
    public String hello(){
        return "Hello Erdenee";
    }
}
