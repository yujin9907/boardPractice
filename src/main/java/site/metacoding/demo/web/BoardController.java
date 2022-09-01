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

@RequiredArgsConstructor
@Controller
public class BoardController {

    private BoardDao boardDao;

    @GetMapping("/board")
    public String board(){
        return "board/main";
    }

    @GetMapping("/board/list")
    public String list(FormDto formDto, Model model){
        boardDao.insert(formDto);
        model.addAttribute("board", formDto);
        return "board/list";
    }
    @GetMapping("/board/create")
    public String createForm(){
        return "board/form";
    }
    @PostMapping("/board/createdo")
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
