package shujukufangwenceng;
//检查用户名和密码是否一致
import Database.DbManager;
import VO.UserInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserInforDAO {
    public int checkUserInfo(UserInfo userInfo){
        int flag=0;
       String strsql="Select name,pass from t_user where name='"+userInfo.getName ()+"'and pass='"+userInfo.getPass (  )+"'";
        try {
        DbManager dbManager=new DbManager ();
        ResultSet resultSet= dbManager.queryMethod ( strsql );
        String name=null;
        String pass=null;
        while (resultSet.next ()){
          name= resultSet.getString ( "name" );
          pass= resultSet.getString ( "pass" );
          if(name.equals (userInfo.getName ()  )&&pass.equals ( userInfo.getPass () )){
             flag=1;
          }else{
             flag=0;
          }
          return flag;
        }
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return flag;
    }
}
