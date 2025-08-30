package mn.erdenee.course.demo.Controller.Register;

import mn.erdenee.course.demo.Service.UserService;
import mn.erdenee.course.demo.Model.Users;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
public class UserRegister {
    private UserService service;

    public UserRegister(UserService service){
        this.service=service;
    }

    @PostMapping
    public ResponseEntity<Users> create(@RequestBody Users user) throws Exception {
        Users createdUser = service.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

}
