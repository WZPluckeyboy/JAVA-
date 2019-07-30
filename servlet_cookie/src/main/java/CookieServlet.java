import javax.jws.WebService;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/cookieServl")
public class CookieServlet extends HttpServlet {
    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost ( request,response );
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
       //八大内置对象：(page,request,response,session,application,exception,ServletContext,ServletConfign)
        response.setContentType ( "text/html;charset=UTF-8" );
        PrintWriter out=response.getWriter ();
        for(int i=0;i<3;i++){
            Cookie cookie=new Cookie ("cookieKey"+i,"cookieValue"+i);
            response.addCookie ( cookie );
            cookie=new Cookie ( "PersistentCookirKey"+i,"PersistentCookieValue"+i );//持久化的cookie
            cookie.setMaxAge(36000);//设置第二个cookie的存活时间
          response.addCookie ( cookie );//把cookie加入response  中
        }
        out.append ( "<html>" )
                .append("<head><title>营营我好喜欢你呀</title></head>")
                .append ( "<body>" )
                .append ( "用户 :<input type='text'   name='营营'/></br>")
                .append ( "密码:<input type='password' name='pwd' /></br>" )
                .append ( "<h1> 我爱你营营</></br>" )
                .append("<a href='showServlet'>去看营营</a>")
                .append ( "<input type='submit' value='提交'/>" )
                .append ( "<a href= 'ShowServlet'>Go to Show Cookie</a>" )
                .append("</body>")
                .append ( "</html>" );
    }
}
