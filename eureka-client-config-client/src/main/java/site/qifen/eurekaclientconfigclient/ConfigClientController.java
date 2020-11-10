package site.qifen.eurekaclientconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${aa.bb}")
    String configText;

    //使用配置中心的服务的配置
    @GetMapping("/config")
    public String config() {
        return configText;
    }
}
