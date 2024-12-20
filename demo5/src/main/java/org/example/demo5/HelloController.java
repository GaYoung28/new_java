package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloController", value = "/controller")
public class HelloController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //doget: get 요청일때 자동 호출됨
        // 네트워크 통신할 때 exception처리 꼭 해줘야 함
        // 주소는 설정파일에 넣거나 @로 나타내줄수 있음
        //주소는 index.jsp파일에 a태그로 넣어줌
        // a태그는 일반적으로 GET 요청
        System.out.println("Get------------------");
        //http의 body에 넣어서 보내줌.
        resp.getWriter().println("Controller GET ------"); //보낼 때 print해서 보냄
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // post 요청은 form으로
        System.out.println("POST------------------");
        resp.getWriter().println("Controller POST --------");
    }
}
