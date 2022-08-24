package com.side.practice.controller;

import com.side.practice.entity.Board;
import com.side.practice.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/board") // 모든 url 앞에 이거 붙여야 됨
public class BoardController {

    @Autowired // DI 할 수 있게 해줌
    private BoardRepository boardRepository;

    @GetMapping("/boot")
    public String boot(){
        return "board/bootstrap";
    }


    @GetMapping("/list")
    public String list(Model model){
        List<Board> boards = boardRepository.findAll();
        model.addAttribute("boards", boards);
        return "board/list";
    }
    // boards 넘겨주고 list retrun, 객체를 넘겨주지 않으면 redirect로 가능

    // 스프링 공식 홈페이지, 가이드 > form으로 검색
    @GetMapping("/form")
    public String form(@ModelAttribute Board board){
        boardRepository.save(board);
                // 스프링 jpa 에서 제공하는 기본메서드
        return "board/form";
    }

    @GetMapping("/calender")
    public String calender(){
        return "board/calenderPage";
    }

}
