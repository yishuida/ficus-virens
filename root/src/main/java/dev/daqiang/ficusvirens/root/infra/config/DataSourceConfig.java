package dev.daqiang.ficusvirens.root.infra.config;


import dev.daqiang.ficusvirens.root.common.constant.DatabaseTypeEnum;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;
/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
// @Configuration
public class DataSourceConfig {

    @Autowired
    DataSource dataSource;

    @Value("${mybatis.mapper-locations}")
    private String mapperLocations;


    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public DatabaseIdProvider databaseIdProvider() {
        DatabaseIdProvider databaseIdProvider = new VendorDatabaseIdProvider();

        Properties properties = new Properties();
        for (DatabaseTypeEnum dbType: DatabaseTypeEnum.values()) {
            properties.setProperty(dbType.getType(), dbType.getAlias());
        }
        databaseIdProvider.setProperties(properties);

        return databaseIdProvider;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setDatabaseIdProvider(databaseIdProvider());
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
        return factoryBean;
    }
}
