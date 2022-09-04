package site.metacoding.demo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import site.metacoding.demo.domain.board.Board;
import site.metacoding.demo.domain.board.BoardDao;
import site.metacoding.demo.domain.board.mapper.BoardView;
import site.metacoding.demo.web.dto.req.board.FormDto;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class BoardController {

    private final BoardDao boardDao;

    @GetMapping("/board")
    public String board(){
        return "main";
    }

    // 한건조회
    @GetMapping("/board/{id}")
    public String findById(@PathVariable Integer id, Model model){
        BoardView view = boardDao.findByIdView(id);
        model.addAttribute("board", view);
        return "board/view";
    }

    // 전체조회
    @GetMapping("/board/list")
    public String list(Model model){
        List<Board> b = boardDao.findAll();
        model.addAttribute("boards", b);
        return "board/list";
    }

    // 글 작성
    @GetMapping("/board/create")
    public String createForm(){
        return "board/form";
    }
    @PostMapping("/board/create")
    //requestParam
    public String create(@RequestParam FormDto formDto, @RequestParam MultipartFile file) throws IOException {

        String image = file.getOriginalFilename(); // 업로드 파일 명
        file.transferTo(new File(image)); // 파일 저장

        //https://velog.io/@gmtmoney2357/%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8-%ED%8C%8C%EC%9D%BC-%EC%97%85%EB%A1%9C%EB%93%9C-%EB%8B%A4%EC%9A%B4%EB%A1%9C%EB%93%9C-%EC%9D%B4%EB%AF%B8%EC%A7%80-%EB%B3%B4%EC%97%AC%EC%A3%BC%EA%B8%B0

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
