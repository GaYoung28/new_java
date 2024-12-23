package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CityServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("CityServlet2 initialized");
        System.out.println("doGet method called");
        System.out.println("City Name: busan");
        System.out.println("City Population: 5000");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "GET request received" + "</h1>");
        out.println("</body></html>");

        String name = req.getParameter("name");
        String population = req.getParameter("population");

        resp.getWriter().println("City Name: " + name + "<br>");
        resp.getWriter().println("Population: " + population);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "POST request received" + "</h1>");
        out.println("</body></html>");

        String name = req.getParameter("name");
        String population = req.getParameter("population");

        resp.getWriter().println("City Name: " + name + "<br>");
        resp.getWriter().println("Population: " + population);

    }
}
