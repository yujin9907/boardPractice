package site.metacoding.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import site.metacoding.demo.board.Board;
import site.metacoding.demo.boardRepository.BoardRepository;
import site.metacoding.demo.dto.BoardForm;
import site.metacoding.demo.service.BoardService;
import site.metacoding.demo.utils.MyPath;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/board/main")
    public String main(){
        return "board/main";
    }

    @GetMapping("board/writeForm")
    public String writeForm(){
        return "board/writeForm";
    }

    @PostMapping("board/write")
    public String write(BoardForm board, MultipartFile pic) {

        // 1. dto를 entity로 변환
        Board b = board.toEntity();

        // 2. 리포지토리에게 엔티티를 db에 저장하도록
        Board saved = boardService.insert(b);

//        Board b = new Board();
//
//        String picName = pic.getOriginalFilename();
//        String path = "D:/javaStudy/pic/";
//        Path picPath = Paths.get(MyPath.IMAGEPATH + picName);
//        try {
//            Files.write(picPath, pic.getBytes());
//        } catch (Exception e) {}
//
//        b.setTitle(board.getTitle());
//        b.setContent(board.getContent());
//        b.setPic(String.valueOf(picPath));
//
//        boardService.insert(b);
//
//        return "redirect:/board/list";
    }

    @GetMapping("board/list")
    public String list(Model model){
        List<Board> list = boardService.findAll();
        model.addAttribute(list);
        return "board/list";
    }

}
