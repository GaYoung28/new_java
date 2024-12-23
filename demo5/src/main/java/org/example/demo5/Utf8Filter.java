package org.example.demo5;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*") // /*만 쓰면 모든 요청에 다 적용하겠다, /*.do로 쓰면 do로 끝나는 파일에 적용하겠다
public class Utf8Filter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("필터 초기화");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        //필터 내용
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        filterChain.doFilter(req, resp); //처리할 것이 여러개이면 filterChain으로 묶어줌
    }

    @Override
    public void destroy() {
        // 필터 소멸할 때 처리 내용
    }
}
