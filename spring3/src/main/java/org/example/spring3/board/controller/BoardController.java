package org.example.spring3.board.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("board")
@Controller
public class BoardController {

    @GetMapping("board")
    public String board() {
        log.info("board----------");
        return "board/board";
    }
}
