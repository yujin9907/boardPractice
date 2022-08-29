package site.metacoding.demo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import site.metacoding.demo.entity.*;

@Getter
@Setter
public class BoardDto {
    private String title;
    private String content;
    private String pic;

    public Board toEntity() {
        Board build = Board.builder()
                .title(title)
                .content(content)
                .pic(pic)
                .build();
        return build;
    }

    @Builder
    public BoardDto(String title, String content, String pic){
        this.title = title;
        this.content = content;
        this.pic = pic;
    }
}
