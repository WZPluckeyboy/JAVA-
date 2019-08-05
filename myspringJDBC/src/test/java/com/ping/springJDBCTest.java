package com.ping;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.activation.DataSource;
import java.util.ArrayList;
import java.util.List;

public class springJDBCTest {
private ApplicationContext context=null;
private JdbcTemplate jdbcTemplate=null;
@Before
    public void testInit(){
    context=new ClassPathXmlApplicationContext ( "applicationContext.xml" );
}
    @Test
    public void testDataSource(){
        DataSource dataSource = (DataSource) context.getBean("myDataSource");
        System.out.println("dataSource" + dataSource);
    }
@Test
    public void testUpdateForspring(){
    int flag = 0;
    try {
        jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        String strSql = "update employee set name=? where id=?";
        flag = jdbcTemplate.update(strSql,"WWW",2);
        System.out.println("flag = " + flag);
    }catch (Exception ex){
        ex.printStackTrace();
    }
}
    @Test
    public void testInsertForSpringJDBC(){
        try {
            jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
            String strSql = "insert into tt (name,id) values (?,?)";
            List<Object[]> listObjects = new ArrayList<Object[]> ();
            listObjects.add(new Object[]{"arvin",1});
            listObjects.add(new Object[]{"xiaoming",1});
            listObjects.add(new Object[]{"xiaohua",2});
            jdbcTemplate.batchUpdate(strSql,listObjects);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Test
    public void testQueryForSpringJDBC(){
        try {
            jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
            String strSql = "select * from tt where id=?";
            RowMapper rowMapper = new BeanPropertyRowMapper (t_user.class);
           t_user employee = (t_user) jdbcTemplate.queryForObject(strSql,rowMapper,2);
            System.out.println(employee);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    }


