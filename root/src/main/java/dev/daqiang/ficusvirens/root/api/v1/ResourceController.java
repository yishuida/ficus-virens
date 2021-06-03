package dev.daqiang.ficusvirens.root.api.v1;

import dev.daqiang.ficusvirens.root.domain.entity.Post;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/api/v1")
public class ResourceController {
    private static final Logger logger = LoggerFactory.getLogger(ResourceController.class);

    @RequestMapping("/me")
    public Principal me(Principal principal) {
        logger.debug(principal.toString());
        return principal;
    }

    @GetMapping("/post")
    public Post[] getPost() {
        return new Post[]{
          new Post("post 1", "title 1", "context 1"),
          new Post("post 2", "title 2", "context 2"),
          new Post("post 3", "title 3", "context 3"),
        };
    }
}
