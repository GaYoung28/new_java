package org.example.demo5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductController{

    public void insert(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("result","상품등록완료");
        RequestDispatcher rd = req.getRequestDispatcher("views/product_result.jsp");
        rd.forward(req,res);
    }

    public void delete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("result","상품삭제완료");
        RequestDispatcher rd = req.getRequestDispatcher("views/product_result.jsp");
        rd.forward(req,res);
    }
}
