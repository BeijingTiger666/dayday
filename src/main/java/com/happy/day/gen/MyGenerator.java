package com.happy.day.gen;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyGenerator {
    @Test
    public void dfsdf() throws IOException {
        final String path =  System.getProperty("user.dir");
        System.out.println(path);
        final File basedir = new File("d:\\aa");
        final File basedir3 = new File(basedir,"bb");
        System.out.println(basedir3.mkdirs());
        System.out.println(basedir3);
        System.out.println(basedir3.isDirectory());
        System.out.println(basedir3.isFile());
        System.out.println("==");
        final File file = new File(basedir3, "xx.xml");
//        file.createNewFile();
        file.mkdirs();
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

    }
    public static void main(String[] args) {
        final String path =  System.getProperty("user.dir");
        System.out.println(path);
        AutoGenerator mpg = new AutoGenerator();
        //指定模板引擎  默认velocity
        //mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        //全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true)
                .setAuthor("yangming")
                .setOutputDir(path+"\\src\\main\\java")
                .setEnableCache(false)
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setIdType(IdType.AUTO)//主键类型
                .setFileOverride(true)
                .setControllerName("%sController")
                .setServiceName("%sService")
                .setServiceImplName("%sServiceImpl")
                .setMapperName("%sMapper")
                .setXmlName("%sMapper");

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/study?characterEncoding=utf8&useSSL=false");
        dsc.setUsername("root");
        dsc.setPassword("123456");
//        String[] tables = {"sys_user","sys_role","sys_menu","sys_user_role","sys_role_menu","sys_dict","sys_logs"};
        String[] tables = {"xuexi"};
        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.happy.day");
        pc.setEntity("entity");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("serviceImpl");
        pc.setMapper("mapper");
        pc.setXml("mapper");

        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
//        		.setTablePrefix("sys_") //表名前缀,
                .setCapitalMode(true)
//                .setLogicDeleteFieldName("rec_status")  //逻辑删除字段
//                .setEntityBuilderModel(true);
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tables)//修改替换成你需要的表名，多个表名传数组
                .setEntityLombokModel(true);//是否使用lombok

        mpg.setGlobalConfig(config);
        mpg.setDataSource(dsc);
        mpg.setStrategy(strategyConfig);
//        mpg.setCfg(ic);
        mpg.setPackageInfo(pc);
        mpg.execute();
    }
}
