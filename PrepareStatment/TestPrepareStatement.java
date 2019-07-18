package PrepareStatment;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class MemoGroup{
    private Integer id;
    private  String name;
    private LocalDateTime createTime;
    private  LocalDateTime modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "MemoGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
public class TestPrepareStatement {
    public static  List<MemoGroup> queryMemoGroup(Integer id,String name){
        List<MemoGroup> list=new ArrayList <> ();
        try {
            Class.forName ( "com.mysql.jdbc.Driver" );
String url="jdbc:mysql://127.0.0.1:3306/memo?user=root&password=wzp961208";
String sql="select id, name, created_time, modify_time from memo_group " +
        "where name = ? or id = ?";
try(Connection connection=DriverManager.getConnection ( url );
    PreparedStatement statement=connection.prepareStatement ( sql )){
    statement.setString ( 1,name );
    statement.setInt ( 2,id );
    try(ResultSet resultSet=statement.executeQuery ()){
        while (resultSet.next ()){
            MemoGroup memoGroup=new MemoGroup ();
            memoGroup.setId ( resultSet.getInt ( "id" ) );
            memoGroup.setName ( resultSet.getString ( "name" ) );
            memoGroup.setCreateTime ( resultSet.getTimestamp ( "created_time" ).toLocalDateTime ());
            memoGroup.setModifyTime ( resultSet.getTimestamp ( "modfiy_time" ).toLocalDateTime () );
            list.add ( memoGroup );
        }
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
      Integer id=3;
      String name="Java";
      List<MemoGroup> memoGroups=queryMemoGroup ( id,name );
      for(MemoGroup memoGroup:memoGroups){
          System.out.println (memoGroup );
      }

    }
}
