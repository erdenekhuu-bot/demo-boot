package mn.erdenee.course.demo.Controller;

import mn.erdenee.course.demo.Model.Users;
import mn.erdenee.course.demo.Service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {
    private final UserService user;

    private APIController(UserService service){
        this.user=service;
    }

    @GetMapping
    public List<Users> getAllUsers(){
        return user.getAllUsers();
    }

    @PostMapping
    public Users create(@RequestBody Users body){
        return user.createUser(body);
    }
}
