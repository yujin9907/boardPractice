package com.side.practice.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Data
public class Board {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 이게 무슨 설정?
    private Long id;
    private String title;
    private String content;
}
