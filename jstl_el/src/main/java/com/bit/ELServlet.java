package com.bit;
import com.bit.VO.Group;
import com.bit.VO.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/ELServlet")
public class ELServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost( request, response );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType ( "text/html;charset=UTF-8" );
        PrintWriter out=response.getWriter ();
        //测试普通字符串
          request.setAttribute ( "strKey","arvin w ming" );
          request.getRequestDispatcher ( "jstl_el.jsp" ).forward ( request,response );
          // 测试结构体
        Group group=new Group ();
        group.setgName ( "RockClass" );
        UserInfo userInfo=new UserInfo ();
        userInfo.setUsername ( "arvin" );
        userInfo.setGroup ( group );
        request.setAttribute ( "userINfoKey",userInfo );

    }
}
