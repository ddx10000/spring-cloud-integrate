package mmm.dong.eureka.client.clients.fallback;

import mmm.dong.eureka.client.clients.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author DongDexuan
 * @date 2018/10/9 15:33
 * @desc
 */
@Component
public class ServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
