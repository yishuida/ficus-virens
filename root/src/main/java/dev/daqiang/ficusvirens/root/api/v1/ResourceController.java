package dev.daqiang.ficusvirens.root.api.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2020/11/8
 * Package dev.daqiang.ficusvirens.root.api.v1 in ficus-virens
 */
@RestController
public class ResourceController {
    private static final Logger logger = LoggerFactory.getLogger(ResourceController.class);

    @RequestMapping("/me")
    public Principal me(Principal principal) {
        logger.debug(principal.toString());
        return principal;
    }
}
