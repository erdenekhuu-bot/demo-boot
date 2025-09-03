package mn.erdenee.course.demo.Route.api.auth;

import mn.erdenee.course.demo.Entity.Profile;
import mn.erdenee.course.demo.Entity.Users;
import mn.erdenee.course.demo.Service.ProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth/profile")
public class ProfileRegister {

    private ProfileService service;

    public ProfileRegister(ProfileService pro){
        this.service=pro;
    }

    @GetMapping
    public ResponseEntity<List<Profile>> list()  {
        List<Profile> profiles = service.listProfile();
        if (profiles.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(profiles, HttpStatus.OK);
        }
    }

    @PostMapping("/{userId}")
    public ResponseEntity<Profile> createProfile(
            @PathVariable Long userId,
            @RequestBody Profile profileData) throws Exception {
        Profile profile = service.createProfile(userId, profileData);
        return ResponseEntity.ok(profile);
    }

}
