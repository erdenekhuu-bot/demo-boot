package mn.erdenee.course.demo.Repo;


import mn.erdenee.course.demo.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Long> {
}
