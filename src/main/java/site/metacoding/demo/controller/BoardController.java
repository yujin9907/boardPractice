package site.metacoding.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import site.metacoding.demo.board.Board;
import site.metacoding.demo.boardRepository.BoardRepository;
import site.metacoding.demo.service.BoardService;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("board/main")
    public String main(){
        return "board/main";
    }

    @GetMapping("board/writeForm")
    public String writeForm(){
        return "board/writeForm";
    }

    @PostMapping("board/write")
    public String write(Board board) {
        Board result = boardService.insert(board);
        if(result!=null){
            return "board/list";
        } else
            return "글을 입력하시오";
    }

    @GetMapping("board/list")
    public String list(Model model){
        List<Board> list = boardService.findAll();
        model.addAttribute(list);
        return "board/list";
    }

}
