package mn.erdenee.course.demo.Route.api.auth;

import mn.erdenee.course.demo.Model.Users;
import mn.erdenee.course.demo.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/auth")
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

    @GetMapping
    public ResponseEntity<List<Users>> list()  {
        List<Users> users = service.getAllUsers();
        if (users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(users, HttpStatus.OK);
        }
    }

}
