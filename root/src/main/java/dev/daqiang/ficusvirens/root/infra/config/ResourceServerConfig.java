package dev.daqiang.ficusvirens.root.infra.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2020/11/7
 * Package dev.daqiang.ficusvirens.root.infra.config in ficus-virens
 */

public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(ResourceServerConfig.class);

    public static final String RESOURCE_ID = "blog_root";

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        super.configure(resources);
        resources.resourceId(RESOURCE_ID);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        logger.info("ResourceServerConfig 配置 httpSecurity 对象执行");
        http.requestMatchers().antMatchers("/api/**")
                .and()
                .authorizeRequests()
                .anyRequest().authenticated();
    }
}
