package com.tom.jspServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @descriptions: test
 * @author: Tom
 * @date: 2021/1/13 上午 12:10
 * @version: 1.0
 */
public class MyServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        req.getRequestDispatcher("/hello.jsp").forward(req,resp);
    }
}
