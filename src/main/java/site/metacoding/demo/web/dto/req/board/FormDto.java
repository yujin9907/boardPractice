package site.metacoding.demo.web.dto.req.board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormDto {
    private String title;
    private String content;
    private String image;
}
