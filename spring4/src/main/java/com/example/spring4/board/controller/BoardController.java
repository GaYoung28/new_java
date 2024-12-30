package com.example.spring4.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class BoardController {

    @GetMapping("board")
    public String board() {
        System.out.println("board 화면 요청 >>>>>>>> ");
        return "board/board";
    }
}
