package dev.daqiang.ficusvirens.root.infra.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
@Configuration
@MapperScan("dev.daqiang.ficusvirens.root.infra.mapper")
public class DataSourceConfig {

/*    @Autowired
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
    }*/

/*    @Bean
    @ConditionalOnMissingBean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        factory.setVfs(SpringBootVFS.class);
        return factory.getObject();
    }*/
}
