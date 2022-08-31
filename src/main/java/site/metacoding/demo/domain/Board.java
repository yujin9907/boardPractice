package site.metacoding.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Board {
    @Id
    private Integer id;
    private String title;
    private String content;
    private String date;
    private String image;
}
