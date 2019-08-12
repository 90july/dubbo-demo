package net.sunnada.test;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ApplicationContextTest {

    @Resource
    private HikariDataSource dataSource;
    @Resource
    private SqlSessionFactoryBean sqlSessionFactoryBean;

    @Test
    public void test(){
            System.out.println(dataSource.getDriverClassName());
    }

}
