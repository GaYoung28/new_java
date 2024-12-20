package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "life", value = "/life")
public class LifeServlet extends HttpServlet {
    //생성자를 하나도 안쓰면 기본 생성자가 만들어진다.
    //서블릿은 최초 호출 시에 객체가 생성되어 메모리에 준비됨.(loading)
    //게으른 로딩(lazy-loading)
    //실행하면 바로 객체 생성이 안되고 호출하면(서블릿생명주기 확인 누르면) 객체 생성됨. -> lazy loading
    public LifeServlet() {
        System.out.println("Life Servlet 객체 생성됨.");
    }
    @Override
    public void destroy() {
        System.out.println("서블릿 소멸됨...");
        //db 연결 객체등의 자원해제
        //서블릿 종료되었을 때 언제, 무슨 이유로... 기록
    }
    //destroy()는 실행 멈추니까 내용 뜸

    @Override
    public void init() throws ServletException {
        System.out.println("서블릿 초기화됨.");
        System.out.println("예) db연결..");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get요청 왔을 때..");
        System.out.println("service()에서 method 판단. --> doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post요청 왔을 때..");
        System.out.println("service()에서 method 판단. --> doPost");
    }
}
