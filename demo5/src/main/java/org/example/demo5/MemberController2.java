package org.example.demo5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberController2 {
    //클라이언트 요청 하나당 컨트롤러 함수 하나!
    //insert() 회원가입 기능
    public void insert(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("회원가입 컨트롤 요청");
        // 이건 controller 이기 때문에 view는 따로 만들어야 함. M,V,C 분리시키자
        // view 파일을 불러서 응답하게 하자.!
        // view 파일을 설정
        // jsp를 서버가 부를 때 forward를 씀
        // jsp는 서블릿으로 변환되는데 service 메서드 호출 ====> req, resp 입력 값으로 가져야 호출 가능하다
        // -> service(req,res)안으로 jsp 자바 코드가 다 들어감.
        // forward로 jsp를 호출할 때 service(req,res) 호출함. 입력값으로 req,res 필요!!!!
        // forward 할 때 req, res 객체를 함께 전달!!!!!!!
        // jsp로 전달할 컨트롤러에서 결과를 전달할 값이 있으면 값은 request의 속성으로 설정함.
        // forward로 전달할 때 이 속성도 함께 전달됨.
        req.setAttribute("result","회원가입 성공함");
        RequestDispatcher rd = req.getRequestDispatcher("views/member_result.jsp");
        // view 파일로 설정한 파일을 불러주는 부분!
        // 컨트롤러에서 처리한 결과를 jsp에 넣어서 응답할 때 ----> forward
        // forward : 서버의 controller가 내 주소를 부를 때 (클라이언트가 부르는 것이 아님!!)
        // ex) 회원가입을 하고 결과를 "회원가입 성공했습니다(jsp)" 보내고 싶음.
        rd.forward(req,res);
        // <---> res.redirect("/") (서버가 클라이언트에게 주소를 호출하도록 명령하는 것)
        // 컨트롤러에서 처리한 결과를 보낼 필요가 없고 새로운 요청을 하라고 할 때 ---> redirect
        // ex) 회원가입 성공적으로 처리 --> 다음 작업은 로그인 화면을 요청 (but, 결과를 redirect로 넣진 않음)
    }

    //delete() 회원탈퇴 기능
    public void delete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("회원탈퇴 컨트롤 요청");
        req.setAttribute("result","회원탈퇴 성공함");
        RequestDispatcher rd = req.getRequestDispatcher("views/member_result.jsp");
        rd.forward(req,res);
    }
}
