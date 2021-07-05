package Druid.demo01;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
//        System.out.println(System.getProperty("user.dir"));//用户的当前路径
//        System.out.println(DruidDemo.class.getClassLoader().getResource("druid.properties").getPath());
//        System.out.println("============");
        InputStream is = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
