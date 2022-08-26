package com.side.practice.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
//@Data // tostring, allargsconstructor, setter, getter 다 포함
public class Board {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  AUTO_INCREMENT
    private Long id;
    private String title;
    private String content;

    public Board() {

    }


//    private String path; 사진 담을 거 나중에
}
