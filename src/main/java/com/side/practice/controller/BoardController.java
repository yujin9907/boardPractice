package com.side.practice.controller;

import com.side.practice.entity.Board;
import com.side.practice.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board") // 이거 뭐임?
public class BoardController {

    @Autowired // DI 할 수 있게 해줌
    private BoardRepository boardRepository;

    public String list(Model model){

        List<Board> boards = boardRepository.findAll();
        model.addAttribute("boards", boards);
        return "board/list";
    }

}
