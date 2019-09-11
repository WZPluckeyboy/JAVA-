package com.ming;

import com.ming.mapper.OrdersMapper;
import com.ming.mapper.UserMapper;
import com.ming.po.Orders;
import com.ming.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void testInit() {
        String file = "sqlMapConfig.xml";
        try {
            InputStream is = null;
            is = Resources.getResourceAsStream(file);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void testQueryUserById_Level_1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            /**
             * 1 mybatis的一级缓存就是sqlSession,它没有办法控制，不用也得用。
             * 2 一级缓存(sqlSession)不需要添加任何配置，就可以使用
             * 3 一级缓存在执行update,insert,delete的时候当sqlSession.commit()操作时
             * 会清空一级缓存，目的是为了避免脏读。
             */
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //第一次执行查询，先去缓存(sqlSession)中查找（没有），于是去数据库中查询发出sql语句
            User user = userMapper.queryUserById(1);
            System.out.println(user);

            //更新操作
            user.setUserId(1);
            user.setUserName("NNNN");
            userMapper.updateUserById(user);
            sqlSession.commit();//清空一级缓存

            //第二次执行查询，先去缓存(sqlSession)中查找（有），于是不再去数据库中查询
            User user2 = userMapper.queryUserById(1);
            System.out.println(user2);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }


    @Test
    public void testQueryUserById_Level_II() {


        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();


        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        //第一次请求
        User user1 = userMapper1.queryUserById(1);
        System.out.println(user1);
        sqlSession1.close();//只有关闭，才能写入二级缓存区域中去


        //测试清空
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
        User user = userMapper3.queryUserById(1);
        user.setUserName("UUUUU");
        userMapper3.updateUserById(user);
        sqlSession3.commit();//执行提交操作,清空UserMapper中的二级缓存
        sqlSession3.close();//执行关闭操作，写入二级缓存中去


        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        //第二次请求
        User user2 = userMapper2.queryUserById(1);
        System.out.println(user2);
        sqlSession2.close();
    }

    @Test
    public void testFindOrderUserLazyLoad()throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
        //仅仅查询orders一张表  select * from orders;
        List<Orders> ordersList =  ordersMapper.findorderuserlazyload();


//        for(Orders orders : ordersList){
//            User user = orders.getUser(); //延迟加载  select * from user where userid=???
//            System.out.println(user);
//        }

        System.out.println(ordersList);//user???

        sqlSession.close();
    }
}
