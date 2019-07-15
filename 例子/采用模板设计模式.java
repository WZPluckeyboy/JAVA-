package 例子;
import java.sql.*;
public  abstract class 采用模板设计模式 {
        /*
        不变的：1.加载数据库的JDBC驱动
    2.创建连接
    3.创建命令
    *7.关闭结果
    8。关闭命令
    9.关闭连接*/
  public void execute(String sql){
     this.loadDriver ();
     this.createConnectrion ();
     this.createStatment ();
     if(sql.trim().toUpperCase ().startsWith ( "SELECT" )) {
         this.resultSet=this.executeQuery ( sql );
     }
     else {
         int effect=this.executeUpdata ( sql );
     }
     this.close ();
  }
  //1.加载驱动
  private  Connection connection;
    private  Statement statement;
    private  ResultSet resultSet;
  private  void loadDriver(){
      try {
          Class.forName ( " com.mysql.jdbc.Driver" );
      } catch (ClassNotFoundException e) {
          e.printStackTrace ( );
      }
  }
  //2.获取链接
    private  void createConnectrion(){
        String url="jdbc:mysql://127.0.0.1:3306/memo";
        try {
          this. connection= DriverManager.getConnection ( url,"root","root" );
        } catch (SQLException e) {
            e.printStackTrace ( );
        }
    }
    // 3.创建命令
    private  void createStatment(){
        try {
            this.statement= this.connection.createStatement ();
        } catch (SQLException e) {
            e.printStackTrace ( );
        }
    }
    //4.执行
    //执行更新
    private  int executeUpdata(String sql){
        try {
            return this.statement.executeUpdate ( sql );
        } catch (SQLException e) {
            e.printStackTrace ( );
        }
        return -1;
    }
    //执行查询
    private  ResultSet executeQuery(String sql){
        try {
            return this.statement.executeQuery ( sql );
        } catch (SQLException e) {
            e.printStackTrace ( );
        }
        return null;
    }
    //执行
    public abstract  <T> T handlerResult(ResultSet resultSet);
    //6.关闭
    private  void  close(){
        try {
            if(resultSet!=null) {
                resultSet.close ( );
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



