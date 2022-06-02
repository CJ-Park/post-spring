package posts.postspring.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 모든  Entity 의 상위 클래스로 상속시 자동으로 시간 변수들 Column 으로 인식
@EntityListeners(AuditingEntityListener.class) // Entity Auditing (감시)
public abstract class BaseTimeEntity {

    @CreatedDate    // 생성시간 자동저장
    private LocalDateTime createdDate;

    @LastModifiedDate   // 변경시간 자동저장
    private LocalDateTime modifiedDate;
}
