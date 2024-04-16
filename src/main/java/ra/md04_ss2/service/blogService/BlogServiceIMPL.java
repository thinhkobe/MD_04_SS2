package ra.md04_ss2.service.blogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.md04_ss2.model.Blog;
import ra.md04_ss2.repository.BlogRepo;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceIMPL implements IBlogservice{
    @Autowired
    private BlogRepo blogRepo;
    @Override
    public List<Blog> findAll() {
        return blogRepo.findAll();
    }

    @Override
    public Blog findById(Long id) {
        Optional<Blog> blog=blogRepo.findById(id);
        return blog.orElse(null);
    }

    @Override
    public void save(Blog blog) {
        if (blog.getId()==null){
        blog.setCreatedAt(LocalDateTime.now());
        }else
         blogRepo.save(blog);
    }

    @Override
    public void deleteById(Long id) {
        blogRepo.deleteById(id);
    }
}
