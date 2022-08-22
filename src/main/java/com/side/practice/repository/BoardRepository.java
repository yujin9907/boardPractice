package com.side.practice.repository;

import com.side.practice.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
// jpa 기본제공 메소드
// 필요시 메소드 직접 추가 가능