package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ArrayList<Item> cart = (ArrayList<Item>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
        }

        // 요청 파라미터에서 상품 정보 가져오기
        String itemName = req.getParameter("itemName");
        int itemPrice = Integer.parseInt(req.getParameter("itemPrice"));

        // 상품 객체 생성 및 장바구니에 추가
        Item newItem = new Item(itemName, itemPrice);
        cart.add(newItem);

        // 세션에 장바구니 저장
        session.setAttribute("cart", cart);

        resp.sendRedirect("product.jsp");

    }
}

