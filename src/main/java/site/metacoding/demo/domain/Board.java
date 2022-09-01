package site.metacoding.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private Integer id;
    private String title;
    private String content;
    private String image;
    private String date;
}
