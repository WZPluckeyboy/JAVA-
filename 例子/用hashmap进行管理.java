package 例子;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 用hashmap进行管理 {
    public static List<Map<String,Object>> querryMemoGroupByName(String groupName){
        List<Map<String,Object>> list=new ArrayList <> (  );
        try {
            Class.forName ( "com.mysql.jdbc.Driver" );
            String url="jdbc:mysql://127.0.0.1:3306/memo?user=root&password=wzp961208";
            String sql="select id,name,created_time,modify_time from memo_group where name = '" + groupName + "'";
            try(Connection connection=DriverManager.getConnection ( url );
                Statement statement=connection.createStatement ();
                ResultSet resultSet=statement.executeQuery ( sql )){
                while(resultSet.next ()){
                    int id=resultSet.getInt ( "id" );
                    String name=resultSet.getString ( "name" );
                    Timestamp createTime=resultSet.getTimestamp ( "created_time" );
                    Timestamp modifyTime=resultSet.getTimestamp ( "modify_time" );
                    Map<String,Object> row=new HashMap <> (  );
                    row.put("id",id);
                    row.put ( "name",name );
                    row.put ( "createTime",createTime );
                    row.put ( "modifyTime",modifyTime );
                    list.add ( row) ;
                }

            } catch (SQLException e) {
                e.printStackTrace ( );
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace ( );
        }
        return list;
    }
    public static void main(String[] args) {
        List<Map<String,Object>> data=querryMemoGroupByName("' or 1=1 or name='");
        for(Map<String,Object> item: data){
            System.out.println (item );
        }



    }
}
