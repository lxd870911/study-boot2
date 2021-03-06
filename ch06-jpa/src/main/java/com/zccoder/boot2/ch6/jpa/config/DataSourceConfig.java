package com.zccoder.boot2.ch6.jpa.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * <br>
 * 标题: 配置数据源<br>
 * 描述: 配置数据源<br>
 * 时间: 2018/06/26<br>
 *
 * @author zc
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "dataSource")
    public DataSource dataSource(Environment environment){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(environment.getProperty("spring.datasource.url"));
        dataSource.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUsername(environment.getProperty("spring.datasource.username"));
        dataSource.setPassword(environment.getProperty("spring.datasource.password"));
        return dataSource;
    }
}
