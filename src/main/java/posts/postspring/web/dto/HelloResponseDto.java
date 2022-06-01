package posts.postspring.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor    // final 필드만을 포함하는 생성자를 추가
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
