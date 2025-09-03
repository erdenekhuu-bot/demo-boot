package mn.erdenee.course.demo.Repo;


import mn.erdenee.course.demo.Entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepo extends JpaRepository<Profile, Long> {
}
