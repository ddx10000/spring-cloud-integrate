package mmm.dong.eureka.client.controller;

import mmm.dong.eureka.client.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DongDexuan
 * @date 2018/10/9 11:51
 * @desc
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) throws Exception {
        return helloService.hiService(name);
    }
}
