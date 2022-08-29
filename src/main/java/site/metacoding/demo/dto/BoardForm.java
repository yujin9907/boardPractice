package site.metacoding.demo.dto;

import site.metacoding.demo.board.Board;

public class BoardForm {
    private String title;
    private String content;
    private String pic;

    public BoardForm(String title, String content, String pic) {
        this.title = title;
        this.content = content;
        this.pic = pic;
    }

    public Board toEntity(){
        return new Board(null, title, content, pic);
    }
}
