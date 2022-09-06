package site.metacoding.demo.domain.board;

import site.metacoding.demo.domain.board.mapper.BoardView;
import site.metacoding.demo.web.dto.req.board.FormDto;

import java.util.List;

public interface BoardDao {
    public void insert(FormDto formDto); // DTO 생각해보기
    public Board findById(Integer id);
    public List<Board> findAll();
    public BoardView findByIdView(Integer id); // 리턴 타입 수정 이름이 기억 안남
}
