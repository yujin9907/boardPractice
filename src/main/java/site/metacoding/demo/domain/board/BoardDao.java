package site.metacoding.demo.domain.board;

import site.metacoding.demo.web.dto.req.board.FormDto;

import java.util.List;

public interface BoardDao {
    public void insert(FormDto formDto); // DTO 생각해보기
    public Board findById(Integer id);
    public List<Board> findAll();
//    public void update(Board boards); // DTO 생각해보기
//    public void delete(Integer id);
}
