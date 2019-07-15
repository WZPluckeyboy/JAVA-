package 例子;
import java.sql.*;
public class WriteData {
    public static void main(String[] args) {
        Connection connection= null;
        Statement statement=null;
        ResultSet effect=null;
        //1.
        try {
            Class.forName ( " com.mysql.jdbc.Driver" );
            //2.JDBC url 协议
            String url="jdbc:mysql://127.0.0.1:3306/memo?user=root&password=wzp961208";
                connection = DriverManager.getConnection ( url );
            //3.创建命令
           statement=connection.createStatement ();
            //4.写入
            String sql="insert into memo_group(name,created_time) values ('今天是个好日子','2019-06-24 19:42:00');";
            //5执行
             effect=statement.executeQuery (sql  );
            //6.
            System.out.println (effect );

        } catch (ClassNotFoundException e) {
            e.printStackTrace ( );
        } catch (SQLException e) {
            e.printStackTrace ( );
        }finally {
            //7.关闭结果集
            try {
                if(effect!=null) {
                    effect.close ( );
                }
                //8.关闭命令
                if(statement!=null) {
                    statement.close ( );
                }
                //9.关闭连接
                if(connection!=null) {
                    connection.close ( );
                }
            } catch (SQLException e) {
                e.printStackTrace ( );
            }
        }
    }
}
