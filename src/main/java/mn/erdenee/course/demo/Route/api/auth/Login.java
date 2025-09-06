package mn.erdenee.course.demo.Route.api.auth;


import mn.erdenee.course.demo.Entity.Users;
import mn.erdenee.course.demo.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class Login {
    private UserService service;

    Login(UserService service){
        this.service=service;
    }
    @PostMapping
    public ResponseEntity<Users> login(@RequestBody Users user) throws Exception{
        Users existuser=service.login(user.getPhone());
        if (existuser != null) {
            return ResponseEntity.ok(existuser);
        } else {
            return (ResponseEntity<Users>) ResponseEntity.status(HttpStatus.UNAUTHORIZED);
        }
    }
}
