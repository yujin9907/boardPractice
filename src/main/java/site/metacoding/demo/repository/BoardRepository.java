package site.metacoding.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.metacoding.demo.domain.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
}
