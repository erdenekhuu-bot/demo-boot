package mn.erdenee.course.demo.Repo;


import mn.erdenee.course.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
