package site.metacoding.demo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import site.metacoding.demo.domain.Board;
import site.metacoding.demo.domain.BoardDao;
import site.metacoding.demo.web.dto.req.FormDto;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BoardController {

    private final BoardDao boardDao;

    @GetMapping("/board")
    public String board(){
        return "board/main";
    }

    // 전체조회
    @GetMapping("/board/list")
    public String list(Model model){
        List<Board> b = boardDao.findAll();
        model.addAttribute("list", b);
        return "board/list";
    }

    // 글 작성
    @GetMapping("/board/create")
    public String createForm(){
        return "board/form";
    }
    @PostMapping("/board/create")
    public String create(FormDto formDto){
        boardDao.insert(formDto);
        return "redirect:/board/list";
    }
//    @GetMapping("/board/list")
//    public String list(Board board, Model model){
//        Board b = boardRepository.save(board);
//        model.addAttribute("board", b);
//        return "board/list";
//    }
//    @PostMapping("/board/insert")
//    public board insert(BoardDto boardDto){
//        BoardDto bd = new BoardDto();
//        bd.setTitle(boardDto.getTitle());
//        return "board/okInsert";
//    }
}
