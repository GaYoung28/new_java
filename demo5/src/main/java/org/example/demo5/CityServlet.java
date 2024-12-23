<<<<<<< HEAD
package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CityServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("Get------------");
        resp.getWriter().println("서블릿 초기화");
        resp.getWriter().println("GET 요청 처리됨");
        resp.getWriter().println("GET 요청 처리됨");

    }
}
=======
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
>>>>>>> 8590881171e41f9373d79e43e40bf499618b9c5f
