package org.example.spring2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @GetMapping("createPost")
    public String createPost() {
        return "createPost"; //html 파일명 리턴
    }

    @PostMapping("createPost2")
    //Model 전달할 값 설정
    public String createPost2(BoardVO boardVO, Model model) {
        model.addAttribute("boardVO", boardVO);
        //model에 VO 넘겨서
        //boardVO.no
        return "createPost2";
    }

    @GetMapping("deletePost")
    public String deletePost(int no, Model model) {
        model.addAttribute("no", no);
        return "deletePost";
    }

    @GetMapping("editPost")
    public String editPost(int no, Model model) {
        model.addAttribute("no", no);
        return "editPost";
    }

    @PostMapping("viewPost")
    public String viewPost(int no) {
        return "viewPost";
    }
}
