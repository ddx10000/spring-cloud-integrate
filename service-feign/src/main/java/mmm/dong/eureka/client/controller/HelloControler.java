package mmm.dong.eureka.client.controller;

import mmm.dong.eureka.client.clients.SchedualServiceHi;
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

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
