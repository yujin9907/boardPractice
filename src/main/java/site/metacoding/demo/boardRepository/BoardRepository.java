package site.metacoding.demo.boardRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;
import site.metacoding.demo.entity.Board;

// 이건 그냥 db와의 연결을 객체로 받아주기 위한 엔티티, db를 직접 건드는 애
@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
}