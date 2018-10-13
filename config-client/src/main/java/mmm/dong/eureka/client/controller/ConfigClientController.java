package mmm.dong.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DongDexuan
 * @date 2018/10/11 15:16
 * @desc
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/haha")
    public String hi(){
        return foo;
    }
}
