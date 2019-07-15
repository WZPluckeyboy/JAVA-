package 例子;
import java.sql.*;
public class 自动关闭 {
    public static void main(String[] args) {
        try {
            Class.forName ( "com.mysql.jdbc.Driver" );
            String url="jdbc:mysql://127.0.0.1:3306/memo?user=root&password=wzp961208";
            String sql="select id ,name,created_time,modify_time from memo_group";
            try(Connection connection=DriverManager.getConnection ( url ); Statement statement=connection.createStatement ();
                ResultSet resultSet=statement.executeQuery ( sql )){
                while(resultSet.next()){
                    int id=resultSet.getInt ( "id" );
                    String name=resultSet.getString ( "name" );
                    Timestamp createTime=resultSet.getTimestamp ( "created_time" );
                    Timestamp modifyTime=resultSet.getTimestamp ( "modify_time" );
                    System.out.println (id+" "+name+" "+createTime+" "+modifyTime+" " );
                }

            }catch  (SQLException e) {
                e.printStackTrace ( );
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace ( );
        }
    }
}
