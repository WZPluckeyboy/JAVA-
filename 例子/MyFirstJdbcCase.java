package 例子;
import java.sql.*;
public class MyFirstJdbcCase {
    //1.加载数据库的JDBC驱动
    //2.创建连接
    //3.创建命令
    //4.准备SQL语句
    //5.执行SQL
    //6.处理结果
    //7.关闭结果
    //8。关闭命令
    //9.关闭连接
    public static void main(String[] args) {
        try {
            //1.
            Class.forName("com.mysql.jdbc.Driver");
            //2.JDBC url 协议
            String url="jdbc:mysql://127.0.0.1:3306/memo?user=root&password=wzp961208";
            Connection connection= DriverManager.getConnection ( url );
            //3.创建命令
            Statement statement=connection.createStatement ();
            //4.准备SQL
            String sql="select id ,name,created_time,modify_time from memo_group";
            //5.执行
           ResultSet resultSet= statement.executeQuery ( sql );
            //6.使用
            while(resultSet.next()){
              int id=  resultSet.getInt ( "id" );

          String name=resultSet.getString ( "name" );
         Timestamp createTime=resultSet.getTimestamp ( "created_time" );
         Timestamp modifyTime=resultSet.getTimestamp ( "modify_time" );
                System.out.println (id+""+name+""+createTime+""+modifyTime+"" );

            }
            //7.关闭结果集
            resultSet.close ();
            //8.关闭命令
            statement.close ();
            //9.关闭连接
            connection.close ();
        } catch (ClassNotFoundException e) {
            e.printStackTrace ( );
        } catch (SQLException e) {
            e.printStackTrace ( );
        }
    }

}
