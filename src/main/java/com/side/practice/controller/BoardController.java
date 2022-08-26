package com.side.practice.controller;

import com.side.practice.entity.Board;
import com.side.practice.repository.BoardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;

@Controller
//@RequiredArgsConstructor 뭔지 모름
//@RequestMapping("/board") // 모든 url 앞에 이거 붙여야 됨
public class BoardController {

    private BoardRepository boardRepository;
    //    private final BoardRepository boardRepository;
//    private EntityManager; 이새끼 뭐하는 새낀지 찾아보기 ; 어노테이션 PERSISTENCEcONTEXT를 붙여서 사용, 이럼 그냥 선언하는 거랑 뭔 차이임?

    @GetMapping("/calender")
    public String calender(){
        return "mainCalender";
    }
    @GetMapping("/boardform")
    public String boardForm(){
        return boardForm();
    }


    // 전체 조회
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("list", boardRepository.findAll());
        // return boardRepository.findAll().toString(); // tostring, 반환형태를 string으로 해주기 위해 사용
        return "list";
    }
    // 부분 주회 https://wakestand.tistory.com/668 딱 1/2 지점에 나오는데 엔티티매니저나 쿼리 추가 생성은 나중에 하려고 안 함

    // insert
    @PostMapping("/insert")
    public String insert(@RequestParam(value = "title") String title, @RequestParam(value = "content") String content){
        // if(boardRepository.).isPresent()){}
        Board board = Board.builder().title(title).content(content).build(); // 칼럼을 호출하면서, return으로 넣으려고, 값을 넣어줌 / board에서 한번에 객체로 받아준 거랑 비교해서 정리
        boardRepository.save(board);
        return title+"이 저장되었습니다";
    }



//    @Autowired // DI 할 수 있게 해줌
//    private BoardRepository boardRepository;
//
//    @GetMapping("/boot")
//    public String boot(){
//        return "board/bootstrap";
//    }
//
//
//    @GetMapping("/list")
//    public String list(Model model){
//        List<Board> boards = boardRepository.findAll();
//        model.addAttribute("boards", boards);
//        return "board/list";
//    }
//    // boards 넘겨주고 list retrun, 객체를 넘겨주지 않으면 redirect로 가능
//
//    // 스프링 공식 홈페이지, 가이드 > form으로 검색
//    @GetMapping("/form")
//    public String form(@ModelAttribute Board board){
//        boardRepository.save(board);
//                // 스프링 jpa 에서 제공하는 기본메서드
//        return "board/form";
//    }
//
//    @GetMapping("/calender")
//    public String calender(){
//        return "board/calenderPage";
//    }

}
