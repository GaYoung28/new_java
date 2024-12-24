package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/") // "/"은 모든 요청에 다 적용 localhost:8888/member_insert (http의 header에 들어가있음)
public class DispatcherServlet extends HttpServlet {
    //유일하게 preloading servlet
//    MemberController2 memberController2 = new MemberController2();
//    BoardController2 boardController2 = new BoardController2();
//
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //모든 요청을 이 메서드가 받음.
//        //주소를 추출해서 해당 컨트롤러의 메서드를 호출하자.!
//        String uri = req.getRequestURI(); //member_insert
//        System.out.println("uri: " + uri); //favicon.ico 만들지 않음
//        if (uri.equals("/member_insert")){
//            memberController2.insert(req,resp);
//        } else if (uri.equals("/member_delete")){
//            memberController2.delete(req,resp);
//        } else if (uri.equals("/board_insert")){
//            boardController2.insert(req,resp);
//        }else if (uri.equals("/board_delete")){
//            boardController2.delete(req,resp);
//        }
//    }

    ProductController productController = new ProductController();

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String uri = req.getRequestURI(); //member_insert
        if (uri.equals("/product_insert")){
            productController.insert(req,res);
        } else if (uri.equals("/product_delete")){
            productController.delete(req,res);
        }
    }
}
