package mn.erdenee.course.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import mn.erdenee.course.demo.Entity.Users;
import mn.erdenee.course.demo.Repo.UserRepo;

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

    public Users createUser(Users user) throws Exception{
        if(user.getPhone() == null){
            throw new Exception("Phone required");
        }
        return repo.save(user);
    }

    public Users login(String phone){
        return repo.findByPhone(phone);
    }


    public void deleteUser(Long id){
        repo.deleteById(id);
    }
}
