package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/utf8.do")
public class Utf8Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //받기 전에 한글처리
        //req.setCharacterEncoding("utf-8"); ---> filter 파일에 만들어줌
        String name = req.getParameter("name");

        //보내기 전에 한글처리
        //resp.setContentType("text/html;charset=utf-8"); ---> filter 파일에 만들어줌
        resp.getWriter().println("<h1>" + name + "</h1>");
    }
}
