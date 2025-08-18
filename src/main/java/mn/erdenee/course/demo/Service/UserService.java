package mn.erdenee.course.demo.Service;

import mn.erdenee.course.demo.Model.Users;
import mn.erdenee.course.demo.Repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public List<Users> getAllUsers(){
        return repo.findAll();
    }

    public Optional<Users> getUserById(Long id){
        return repo.findById(id);
    }

    public Users createUser(Users user){
        return repo.save(user);
    }

    public void deleteUser(Long id){
        repo.deleteById(id);
    }
}
