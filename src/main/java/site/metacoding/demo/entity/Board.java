package site.metacoding.demo.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Board {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private String pic;
    @Column
    private String picPath;


}