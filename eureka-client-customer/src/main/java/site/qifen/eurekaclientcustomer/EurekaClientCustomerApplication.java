package site.qifen.eurekaclientcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"site.qifen"})
public class EurekaClientCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientCustomerApplication.class, args);
    }

}
