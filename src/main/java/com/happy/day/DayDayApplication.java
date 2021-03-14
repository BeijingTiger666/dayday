package com.happy.day;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication//(exclude= {DataSourceAutoConfiguration.class})
@ComponentScan({"com.happy.day.*"})
//@MapperScan({"com.happy.day.mapper.*"})
public class DayDayApplication {
    public static void main(String[] args) {
        SpringApplication.run(DayDayApplication.class, args);
    }
}
