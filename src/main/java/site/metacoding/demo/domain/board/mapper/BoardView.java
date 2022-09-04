package site.metacoding.demo.domain.board.mapper;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.demo.domain.user.User;

import java.sql.Timestamp;

@Getter
@Setter
public class BoardView {
    private Integer id;
    private String title;
    private String content;
    private String image;
    private Timestamp date;
    private User user;
}
