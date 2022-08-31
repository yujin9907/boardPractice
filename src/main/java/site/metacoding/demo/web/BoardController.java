package site.metacoding.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import site.metacoding.demo.domain.Board;
import site.metacoding.demo.repository.BoardRepository;

@Controller
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/board")
    public String board(){
        return "board/main";
    }
    @GetMapping("/board/list")
    public String list(Board board, Model model){
        Board b = boardRepository.save(board);
        model.addAttribute("board", b);
        return "board/list";
    }
    @PostMapping("/board/insert")
    public board insert(BoardDto boardDto){
        BoardDto bd = new BoardDto();
        bd.setTitle(boardDto.getTitle());
        return "board/okInsert";
    }
}
