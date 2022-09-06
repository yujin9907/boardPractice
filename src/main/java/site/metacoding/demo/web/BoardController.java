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
import site.metacoding.demo.domain.image.ImageDao;
import site.metacoding.demo.domain.user.User;
import site.metacoding.demo.web.dto.req.board.FormDto;

import javax.servlet.http.HttpSession;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;


@RequiredArgsConstructor
@Controller
public class BoardController {

    private final BoardDao boardDao;
    private final HttpSession session;

    @GetMapping({"/", "/main"})
    public String board(){
        return "main";
    }

    // 상세보기
    @GetMapping("/board/{id}")
    public String detail(@PathVariable Integer id, Model model){
        BoardView view = boardDao.findByIdView(id);
        //이미지 불러오기
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
        User principal = (User) session.getAttribute("principal");
        if (principal==null){
            return "redirect:/";
        }
        return "board/form";
    }
    @PostMapping("/board/create")
    public String create(FormDto formDto, @RequestParam("image") MultipartFile image) throws IOException {
        User principal = (User) session.getAttribute("principal");
        if (principal==null){
            return "redirect:/";
        }

        String projectPath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\images";
        UUID uuid = UUID.randomUUID();

        String imageName = uuid + "_" + image.getOriginalFilename();
        File saveImage = new File(projectPath, imageName);

        image.transferTo(saveImage);

        String imagePath = "/files/"+imageName;

        //imageDao.save(imageName, imagePath);
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
