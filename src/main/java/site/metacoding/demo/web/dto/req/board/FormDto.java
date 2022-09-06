package site.metacoding.demo.web.dto.req.board;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.demo.domain.board.Board;

@Getter
@Setter
public class FormDto {

    // 이거 문제가 findByIdView랑 완전 세트로,
    // 상세보기만을 위한 dto고 쿼리임.
    // 그냥 조인 전체를 받을 걸 그랬나

    private String title;
    private String content;
    private Integer userId;
    private Integer imageId;

}
