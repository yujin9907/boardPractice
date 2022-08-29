package site.metacoding.demo.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
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

    public Board(int id, String title, String content, String pic) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.pic = pic;
    }

    public Board(Integer integer, String title, String content, String pic) {
    }
}
