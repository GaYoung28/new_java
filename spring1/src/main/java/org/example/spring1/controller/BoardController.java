package org.example.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    @GetMapping("createPost")
    public String createPost() {
        System.out.println("createPost------");
        return "createPost";
    }

    @GetMapping("deletePost")
    public String deletePost() {
        System.out.println("deletePost------");
        return "deletePost";
    }

    @GetMapping("editPost")
    public String editPost() {
        System.out.println("editPost------");
        return "editPost";
    }

    @PostMapping("viewPost")
    public String viewPost(int no) {
        System.out.println("viewPost------" + no);
        return "viewPost";
    }

}
