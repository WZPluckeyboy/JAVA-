package Servlet;
import VO.UserInfo;
import shujukufangwenceng.UserInforDAO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet( "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           this.doPost ( request,response );
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setContentType ( "text/html;charset=UTF-8" );
        PrintWriter out=response.getWriter ();
        String username=request.getParameter ( "username" );
        String password=request.getParameter ( "password" );
        UserInfo userInfo=new UserInfo ();
        userInfo.setName ( "username" );
        userInfo.setPass ( "password" );
        UserInforDAO userInforDAO=new UserInforDAO ();
        int flag=userInforDAO.checkUserInfo ( userInfo );
        if(flag==1){
            request.setAttribute ( "userinfo",userInfo );
            request.getRequestDispatcher ( "success.jsp" ).forward ( request,response );
        }else{
            request.getRequestDispatcher ( "failure.jsp" ).forward ( request,response );
        }
    }
}
