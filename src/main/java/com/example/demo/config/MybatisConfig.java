/*
package com.example.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.mapper.MapperScannerConfigurer;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Comparator;

@Configuration
@EnableTransactionManagement
public class MybatisConfig implements TransactionManagementConfigurer {
    @Autowired
    DataSource dataSource;

    @Value("${mybatis.dialect}")
    private String dialect;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.haiercash.pgw.common.data");
        sqlSessionFactoryBean.setDialect(dialect);

        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            Resource[] resources = resolver.getResources("classpath*:com/haiercash/pgw*/
/**//*
mapping*/
/*.xml");
            Arrays.sort(resources, new ResourceComparator());
            sqlSessionFactoryBean.setMapperLocations(resources);
            sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
            sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCaseForMap(true);
//            sqlSessionFactoryBean.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml"));
            return sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

    public class ResourceComparator implements Comparator<Resource> {
        @Override
        public int compare(Resource r1, Resource r2) {
            if (r1.getFilename().equals("AbstractMapper.xml")) {
                return -1;
            } else if (r2.getFilename().equals("AbstractMapper.xml")) {
                return 1;
            }
            return 0;
        }
    }

    @Configuration
    @AutoConfigureAfter(MybatisConfig.class)
    public static class MyBatisMapperScannerConfig {
        @Bean
        public MapperScannerConfigurer mapperScannerConfigurer() {
            MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
            mapperScannerConfigurer.setCamelhumpToUnderline(true);
            mapperScannerConfigurer.setBasePackage("com.haiercash.pgw.**.dao");
            mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
            return mapperScannerConfigurer;
        }
    }
}
*/
