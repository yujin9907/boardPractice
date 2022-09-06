package site.metacoding.demo.domain.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    private Integer id;
    private String title;
    private String content;
    private Timestamp date;
    private Integer userId;
    private Integer imageId;

}
