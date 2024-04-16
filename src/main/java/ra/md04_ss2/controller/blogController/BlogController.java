package ra.md04_ss2.controller.blogController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ra.md04_ss2.model.Blog;
import ra.md04_ss2.service.blogService.IBlogservice;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogservice iBlogservice;

    @RequestMapping(value = "/")
    public String home(Model model) {
        List<Blog> blogList = iBlogservice.findAll();
        model.addAttribute("blogList", blogList);
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String doAdd(@ModelAttribute Blog newBlog) {
        iBlogservice.save(newBlog);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Blog blog = iBlogservice.findById(id);
        model.addAttribute("blog", blog);
        return "/edit-form";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        iBlogservice.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping("/doEdit")
    public String doEdit(@ModelAttribute Blog blog) {
        iBlogservice.save(blog);
        return "redirect:/";
    }


}
