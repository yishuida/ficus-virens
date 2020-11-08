package dev.daqiang.ficusvirens.root.infra.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2020/11/7
 * Package dev.daqiang.ficusvirens.root.infra.config in ficus-virens
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        super.configure(security);
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("client")
                .secret(passwordEncoder.encode("client"))
                .authorizedGrantTypes("authorization_code", "implicit", "client_credentials")
                .accessTokenValiditySeconds(7200)
                .refreshTokenValiditySeconds(72000)
                .redirectUris("http://localhost:8080/login/oauth2/code/authorizationserver")
                .additionalInformation()
                .resourceIds(ResourceServerConfig.RESOURCE_ID)
                .authorities("ADMIN")
                .scopes("profile", "email", "phone", "aaaa")
                .autoApprove("profile");
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        super.configure(endpoints);
    }
}
