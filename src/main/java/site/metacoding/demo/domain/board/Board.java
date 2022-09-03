package site.metacoding.demo.domain.board;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Board {
    private Integer id;
    private String title;
    private String content;
    private String image;
    private Timestamp date;
}
