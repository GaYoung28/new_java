<<<<<<< HEAD
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
=======
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
>>>>>>> 8590881171e41f9373d79e43e40bf499618b9c5f
