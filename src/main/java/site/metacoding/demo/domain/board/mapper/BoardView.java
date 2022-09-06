package site.metacoding.demo.domain.board.mapper;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.demo.domain.user.User;

import java.sql.Timestamp;

@Getter
@Setter
public class BoardView {
    private String title;
    private String content;
    private Timestamp date;
    private String imageId;
    private User username;
}
