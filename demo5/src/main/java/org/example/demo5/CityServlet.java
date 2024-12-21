package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CityServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("서블릿 초기화");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("servlet run");
        System.out.println("GET 요청 처리됨");


    }
}
