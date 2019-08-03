package Database;

import javax.xml.transform.Result;
import java.sql.*;
public class DbManager {
    private Connection conn=null;
    private Statement state=null;
    private ResultSet rs=null;
    private String username="root";
    private String password="wzp961208";
    private String driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/tt";
    public Connection getConnection(){
        try {
            Class.forName ( driver );
            System.out.println ("数据库加载成功" );
            conn=DriverManager.getConnection ( url,username,password );
            System.out.println ("数据库连接成功" );
        } catch (Exception e) {
            e.printStackTrace ( );
        }
       return conn;
    }
     public int updataNethod(String strsql) {
        int flag=0;
         try {
             conn = this.getConnection ( );
             state = conn.createStatement ( );
             System.out.println ("数据库的更新" );
             flag=state.executeUpdate ( strsql );

         }catch (Exception e){
             e.printStackTrace ();
         }
         return flag;
     }
     public  ResultSet queryMethod(String strsql){
         try {
             conn = this.getConnection ( );
             state = conn.createStatement ( );
             System.out.println ("数据库的更新" );
              rs=state.executeQuery ( strsql );
             return rs;
         }catch (Exception e){
             e.printStackTrace ();
         }
         return rs;
     }
     public void closeDB(){
            try {
                if(rs!=null) {
                    rs.close ( );
                }
                if(conn!=null){
                    conn.close ();
                }
                if(state!=null){
                    state.close ();
                }
            } catch (SQLException e) {
                e.printStackTrace ( );
            }
        }
     }

