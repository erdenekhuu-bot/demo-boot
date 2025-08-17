package mn.erdenee.course.demo.Repo;

import mn.erdenee.course.demo.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
}
