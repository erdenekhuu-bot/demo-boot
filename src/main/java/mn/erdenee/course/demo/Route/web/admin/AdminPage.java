package mn.erdenee.course.demo.Route.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPage {

    @GetMapping("/admin")
    public String admin(Model model){
        return "admin";
    }
}
