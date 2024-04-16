package ra.md04_ss2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.md04_ss2.model.Blog;

@Repository
public interface BlogRepo extends JpaRepository<Blog,Long> {

}
