package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CityServlet2 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("CityServlet2 initialized");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String population = req.getParameter("population");
        resp.getWriter().println("<h1> GET request received </h1>");
        resp.getWriter().println("City Name: " + name + "<br>" );
        resp.getWriter().println("City Population: " + population);
        System.out.println("doGet method called");
        System.out.println("City Name: "+ name);
        System.out.println("City Population: " + population);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String population = req.getParameter("population");
        resp.getWriter().println("<h1> POST request received </h1>");
        resp.getWriter().println("City Name: " + name + "<br>");
        resp.getWriter().println("City Population: " + population);
        System.out.println("doPost method called");
        System.out.println("City Name: " + name);
        System.out.println("City Population: " + population);
    }
}

