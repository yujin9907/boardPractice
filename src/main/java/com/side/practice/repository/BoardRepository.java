package com.side.practice.repository;

import com.side.practice.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board save(Board board);
    List<Board> findAll();
    // 나중에 이걸 메모리에 구현하면 됨 저장하는 기능, 검색하는 기능 필요한 거 더 추가
}
