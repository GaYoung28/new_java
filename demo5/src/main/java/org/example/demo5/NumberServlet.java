package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "numberController", value = "/number")
public class NumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet-------------");
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        int num3 = Integer.parseInt(num1);
        int num4 = Integer.parseInt(num2);

        //Integer.parseInt(); 정수변환
        //Double.parseDouble(); 실수변환

        //응답
        resp.getWriter().println("result >> " + (num3 + num4));
    }
}
