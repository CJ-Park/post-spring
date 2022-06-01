package posts.postspring.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import posts.postspring.service.PostsService;
import posts.postspring.web.dto.PostsResponseDto;
import posts.postspring.web.dto.PostsSaveRequestDto;
import posts.postspring.web.dto.PostsUpdateRequestDto;

@RequiredArgsConstructor    // final 필드로 생성자 만들어짐 => 의존성 주입
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

}
