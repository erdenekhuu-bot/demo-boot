package mn.erdenee.course.demo.Controller;


import mn.erdenee.course.demo.Model.User;
import mn.erdenee.course.demo.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AllController {
    private final UserService user;

    private AllController(UserService service){
        this.user=service;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return user.getAllUsers();
    }

    @PostMapping
    public User create(@RequestBody User body){
        return user.createUser(body);
    }
}
