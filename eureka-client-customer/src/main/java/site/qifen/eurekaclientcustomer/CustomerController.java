package site.qifen.eurekaclientcustomer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import site.qifen.clientcustomer.FeignTest;

@RestController
public class CustomerController {

    @Autowired
    FeignTest feignTest;

    @GetMapping("/{txt}")
    public String test(@PathVariable String txt) {
        return feignTest.test(txt);
    }
}
