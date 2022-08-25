package com.side.practice.repository;

import com.side.practice.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
// jpa 기본제공 메소드 :  쿼리 정보를 설정
// 대부분의 쿼리 기능 수행 가능
// 필요시 메소드 직접 추가 가능