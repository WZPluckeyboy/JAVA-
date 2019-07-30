import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/SessionInfoServlet")
public class SessionInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {
        this.doPost(request,respone);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession httpsession=request.getSession ( true );
        out.append ( "<html>" )
                .append ( "<head><title>CookeServlet</title><head>" )
                .append ( "<body>" )
                /*session info*/
                .append ( "sessionID"+httpsession.getId ()+"</br>" )
                .append ( "sessionCreateTime："+httpsession.getCreationTime ()+"</br>" )
                .append ( "sessionLastTime"+new Date ( httpsession.getLastAccessedTime () )+"</br>" )
                .append ( "session via cookie"+request.isRequestedSessionIdFromCookie ()+"</br>" )
                .append ( "session via rewriteURL"+request.isRequestedSessionIdFromURL ()+"</br>" )
                .append ( "session valid?"+request.isRequestedSessionIdValid ()+"</br>" )
                .append ( "</body>" )
                .append ( "</html>" );

    }
}
