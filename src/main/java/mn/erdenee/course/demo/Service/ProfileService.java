package mn.erdenee.course.demo.Service;

import mn.erdenee.course.demo.Entity.Profile;
import mn.erdenee.course.demo.Entity.Users;
import mn.erdenee.course.demo.Repo.ProfileRepo;
import mn.erdenee.course.demo.Repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    private final ProfileRepo repo;
    private final UserRepo userRepo;

    public ProfileService(ProfileRepo repo, UserRepo userRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
    }

    public Profile createProfile(Long userId, Profile profileData) throws Exception {
        Users user = userRepo.findById(userId)
                .orElseThrow(() -> new Exception("User not found with id " + userId));

        Profile profile = new Profile();
        profile.setUser(user);
        profile.setAddress(profileData.getAddress());
        profile.setImage(profileData.getImage());

        return repo.save(profile);
    }

    public List<Profile> listProfile(){
        return repo.findAll();
    }
}
