package site.metacoding.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import site.metacoding.demo.entity.Board;
import site.metacoding.demo.service.BoardService;

import java.io.File;
import java.io.IOException;
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

    @GetMapping("board/list")
    public String list(Model model){
        List<Board> list = boardService.findAll();
        model.addAttribute(list);
        return "board/list";
    }

    @PostMapping("board/write")
    public String write(Board board, MultipartFile file) throws Exception{
        Board b = boardService.insert(board, file);
        return "redirect:/board/list";
    }

    @PostMapping("/board/write/save")
    public String saveImage(@RequestParam String title, @RequestParam MultipartFile pic, String content) throws  IOException{
        System.out.println("title"+title);

        if(!pic.isEmpty()){
            String fullPath = "D:/javaStudy/pic"+pic.getOriginalFilename();
            System.out.println("파일 저장 경로="+fullPath);
            pic.transferTo(new File(fullPath)); // 저장
        }
        return "/board/list";
    }
//        // 1. dto를 entity로 변환
//        Board b = board.toEntity();
//
//        // 2. 리포지토리에게 엔티티를 db에 저장하도록
//        Board saved = boardService.insert(b);

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
