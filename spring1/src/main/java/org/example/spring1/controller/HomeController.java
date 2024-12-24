package org.example.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //mvc 중에서 컨트롤러 역할을 담당하는 것으로 설정.
//주소 + method를 인식해서 처리하는 함수를 호출하는 코드!
public class HomeController {

    //요청하나당 함수하나 get방식+test주소
    @GetMapping("test")
    public String test(){ //함수이름은 마음대로!
        System.out.println("test get요청 들어옴");
        return "test";
        //html 파일 리턴!! test.html 파일을 호출해서 응답
    }

    //요청하나당 함수하나 get방식+member주소
    @GetMapping("member")
    public String member(){ //함수이름은 마음대로!
        System.out.println("member get요청 들어옴");
        return "member";
        //html 파일 리턴!! member.html 파일을 호출해서 응답
    }
    //요청하나당 함수하나 get방식+member주소
    @GetMapping("board")
    public String board(){ //함수이름은 마음대로!
        System.out.println("board get요청 들어옴.");
        return "board";
        //board.html파일을 리턴
    }
}
