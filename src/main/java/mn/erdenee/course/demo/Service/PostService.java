package mn.erdenee.course.demo.Service;

import mn.erdenee.course.demo.Model.Post;
import mn.erdenee.course.demo.Repo.PostRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepo repo;

    public PostService(PostRepo repo){
        this.repo=repo;
    }

    public List<Post> getAllPost(){
        return repo.findAll();
    }
}
