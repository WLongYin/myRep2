package com.example.factory;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @ClassName MyDataSourceFactory
 * @Descrintion TODO
 * @Author wly
 * @Date 2018/11/1 10:44
 * @Version 1.0
 **/
public class MyDataSourceFactory implements DataSourceFactory {
    private DataSource dataSource;
    @Override
    public void setProperties(Properties props) {
        try {
            dataSource = DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }
}
