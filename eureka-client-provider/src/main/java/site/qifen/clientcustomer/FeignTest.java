package site.qifen.clientcustomer;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;

@Service
@FeignClient(name = "eureka-client-customer", contextId = "FeignTest")
public interface FeignTest {
    @GetMapping("/provider/{txt}")
    public String test(@PathVariable String txt);

}
