package posts.postspring.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import posts.postspring.domain.Posts;

@NoArgsConstructor
@Getter
public class PostsSaveRequestDto{

    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(getTitle())
                .content(getContent())
                .author(getAuthor())
                .build();
    }

}
