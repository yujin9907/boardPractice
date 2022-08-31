package site.metacoding.demo.web;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardDto {
    private String title;
    private String content;
    private String data;
    private String image;
}
