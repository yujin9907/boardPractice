package com.side.practice.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Data // tostring, allargsconstructor, setter, getter 다 포함
// @Builder // 사용법을 몰라서 일단 주석
public class Board {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  AUTO_INCREMENT
    private Long id;
    private String title;
    private String content;


//    private String path; 사진 담을 거 나중에
}
