import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/Sersr")
public class Sersr extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost ( request, response );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType ( "text/html;charset=UTF-8" );
        PrintWriter out = response.getWriter ( );
        //1.获取表单参数
        String userName = request.getParameter ( "name" );
        String userpassword = request.getParameter ( "password" );
        //2.判断
        if ("YY".equals ( userName )&&"521".equals ( userpassword )) {
            //去到成功页面
            request.getRequestDispatcher ( "successed.jsp" ).forward ( request, response );

        } else {
            //去到失败页面
          request.getRequestDispatcher ( "shibai.jsp" ).forward ( request, response );

        }
    }
}
