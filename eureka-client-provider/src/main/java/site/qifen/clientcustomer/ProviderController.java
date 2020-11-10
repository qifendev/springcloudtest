package site.qifen.clientcustomer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ProviderController {

    @GetMapping("/provider/{txt}")
    public String test(@PathVariable String txt) {
        return "参数：" + txt;
    }



}
