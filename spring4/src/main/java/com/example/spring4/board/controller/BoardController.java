package com.example.spring4.board.controller;

import com.example.spring4.board.service.BoardService;
import com.example.spring4.board.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("board")
    public String board(Model model) {
        System.out.println("board 화면 요청 >>>>>>>> ");
        //전체 목록
        List<BoardVO> list = boardService.selectBoardAll();
        System.out.println("list.size()" + list.size());
        System.out.println("--------------list-------------");
        System.out.println(list);
        model.addAttribute("list", list);
        //model은 templates 파일까지 list 데이터 전달(주소가 전달)
        return "board/board";
    }

    @GetMapping("create")
    public String create(){
        return "board/create"; //글쓰기 화면 요청
    }

    @PostMapping("create2")
    public String create2(BoardVO boardVO){
        boardService.insertBoard(boardVO);
        //db에 넣고!! --> 삽입성공! 또는 게시판리스트!
        //return "board/board"; //templates/board/
        return "redirect:/board/board";
    }

    @GetMapping("read")
    public String read(int no , Model model){
        BoardVO boardVO = boardService.selectBoardByNo(no);
        model.addAttribute("boardVO", boardVO);
        return "board/read";
    }

    @GetMapping("delete")
    public String delete(int no){
        boardService.deleteBoard(no);
        return "redirect:/board/board";
    }

    //수정버튼 누르면
    //검색 먼저
    @GetMapping("update")
    public String update(int no , Model model){
        BoardVO boardVO = boardService.selectBoardByNo(no);
        model.addAttribute("boardVO", boardVO);
        return "board/update";
    }

    @PostMapping("update2")
    public String update2(BoardVO boardVO){
        boardService.updateBoard(boardVO);
        return "redirect:/board/board";
    }
}

