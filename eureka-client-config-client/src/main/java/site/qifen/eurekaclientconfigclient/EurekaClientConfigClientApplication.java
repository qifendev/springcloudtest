package site.qifen.eurekaclientconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConfigClientApplication.class, args);
    }

}
