package mn.erdenee.course.demo.Repo;


import mn.erdenee.course.demo.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Long> {
}
