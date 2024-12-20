package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//value 속성값이 url임
//name은 tomcat에 등록되는 서블릿의 이름
@WebServlet(name = "second", value = "/second")
public class LoginServlet2 extends HttpServlet {
    //http의 method를 추출해서 get요청이 들어오면 doGet()이 호출
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet-------------");
        //get방식은 tomcat의 server.xml 설정에 따라 결정됨.
        //server.xml에 utf-8로 설정함.
        String id = req.getParameter("id");
        String pw = req.getParameter("pw");
        System.out.println(id + " " + pw);
        //응답을 보낼 때는 body로 보내기 때문에
        //body마다 인코딩을 설정해주어야함.
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println(id+" "+pw);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost-------------");
        //post방식은 get방식(tomcat의 server.xml에 utf-8로 설정함.)과 다르게  !!!!!!!
        //받을 때마다 한글로 인코딩을 해주어야함.
        //파라메터 값을 추출하기 전에 한글 인코딩을 설정해주어야함
        //받기전에 앞에 인코딩처리 등을 하는 프로그램(필터)
        //--> 한글 필터
        req.setCharacterEncoding("UTF-8"); //파라메터를 받기 전에 UTF-8로 인코딩을 먼저 하겠다.
        String id = req.getParameter("id");
        String pw = req.getParameter("pw");
        System.out.println(id + " " + pw);

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println(id+" "+pw);
        PrintWriter out = resp.getWriter(); //문자열들을 http의 body로 넣어서 전송해주는 역할 -> PrintWriter객체
        out.println("<html><body bgcolor=yellow>");
        out.println(id + " " + pw);
        out.println("</body></html>");
        out.close();
    }
}
