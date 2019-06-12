package com.majianjie.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        //取得表单数据

        String username=req.getParameter("username");
        UserManager usermanager=new UserManager();
        List userlist=usermanager.findUserByName(username);
//
        req.setAttribute("userlist", userlist);//设置到req中,key-->value
        req.setAttribute("userlist",username);

        //转向到一个界面c.jsp，取出list中的数据
        req.getRequestDispatcher("/WebRoot/a/b/c/c.jsp").forward(req, res);//转发getRequestDispatcher

    }
}