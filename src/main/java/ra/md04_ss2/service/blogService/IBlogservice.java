package ra.md04_ss2.service.blogService;

import ra.md04_ss2.model.Blog;

import java.util.List;

public interface IBlogservice {
    List<Blog> findAll();
    Blog findById(Long id);
    void save(Blog blog);
    void deleteById(Long id);
}
