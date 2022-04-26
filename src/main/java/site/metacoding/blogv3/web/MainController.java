package site.metacoding.blogv3.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.blogv3.domain.post.Post;
import site.metacoding.blogv3.domain.post.PostRepository;

@RequiredArgsConstructor
@Controller
public class MainController {

    // 업뎃 할 것도 아니고 세이브할 것도 아니고 뿌리고 끝낼거니까
    private final PostRepository postRepository;

    @GetMapping({ "/" })
    public String main(Model model) {

        List<Post> postsEntity = postRepository.mFindByPopular();

        model.addAttribute("posts", postsEntity);

        return "main";
    }
}
