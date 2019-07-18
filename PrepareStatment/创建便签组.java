package PrepareStatment;

import java.sql.*;
import java.time.LocalDateTime;
class MemoGroup1 {
    private Integer id;
    private String name;
    private LocalDateTime createdTime;
    private LocalDateTime modifyTime;

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

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
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
                ", createdTime=" + createdTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}

public class 创建便签组 {

    public static boolean createMemoGroup1(MemoGroup1 memoGroup1) {
        try {
            Class.forName ( "com.mysql.jdbc.Driver" );
            String url = "jdbc:mysql://127.0.0.1:3306/memo?user=root&password=wzp961208";
            String sql = "insert into memo_group (name, created_time) values(?,?)";
            try(Connection connection=DriverManager.getConnection ( url );
            PreparedStatement statement=connection.prepareStatement ( sql );){
             statement.setString ( 1,memoGroup1.getName () );
             statement.setTimestamp ( 2,Timestamp.valueOf ( memoGroup1.getCreatedTime () ) );
             int effect=statement.executeUpdate ();
             return effect==1;
           } catch (SQLException e) {
                e.printStackTrace ( );
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace ( );
        }
        return  false;
    }

    public static void main(String[] args) {
        MemoGroup1 memoGroup1=new MemoGroup1 ();
        memoGroup1.setName ( "个人笔记" );
        memoGroup1.setCreatedTime ( LocalDateTime.now () );
        boolean rs=createMemoGroup1 ( memoGroup1 );
        if(rs){
            System.out.println ( "创建便签组成功");

        }
        else{
            System.out.println ( "创建便签组识别");
        }
    }

}
