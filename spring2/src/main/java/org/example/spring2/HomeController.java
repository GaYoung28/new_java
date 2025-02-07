package org.example.spring2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//스프링프로젝트에서 controller 등록
//싱글톤으로 객체 생성
public class HomeController {
    //요청 하나당 함수 하나
    //요청 2개 --> 함수 2개
    //요청에 url + method ===> 어노테이션으로 설정!

    @GetMapping("member")
    public String member() {
        return "member"; //html 파일을 부르는 건 누가? front controller가
        //프론트컨트롤러에게 결과를 넣어줄 html 파일을 알려줌.
        //프론트컨트롤러가 받은 파일명 .html파일을 호출함.
        //결과를 호출한 html 파일에 넣어서(타임리프 이용)
        //최종 생성된 html 파일을 웹서버에게 전달
        //웹서버는 http로 만들어서 클라이언트에게 응답
    }

    @GetMapping("board")
    public String board() {
        //메서드명은 요청된 주소와 동일하게 만들어주는 편
        //html 파일명도 주소와 일치시켜주는 것이 일반적
        return "board"; //board.html이 호출될 예정
    }
}
