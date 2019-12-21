package dev.daqiang.ficusvirens.root.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
@RequestMapping
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Application is running";
    }
}
