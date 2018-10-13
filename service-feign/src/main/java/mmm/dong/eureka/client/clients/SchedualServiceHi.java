package mmm.dong.eureka.client.clients;

import mmm.dong.eureka.client.clients.fallback.ServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author DongDexuan
 * @date 2018/10/9 14:56
 * @desc
 */
@FeignClient(value = "eureka-client",fallback = ServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
