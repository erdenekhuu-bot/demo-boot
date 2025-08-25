package mn.erdenee.course.demo.Controller.Register;

import mn.erdenee.course.demo.Service.UserService;
import mn.erdenee.course.demo.Model.Users;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/register")
public class UserRegister {
    private UserService service;

    public UserRegister(UserService service){
        this.service=service;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Users user){
        try {
            Users createdUser = service.createUser(user);
            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR); // 500 Error

        }
    }

}
