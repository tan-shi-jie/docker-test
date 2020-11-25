package org.jeecg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.net.UnknownHostException;

@SpringBootApplication
@EnableDiscoveryClient
public class JeecgDemoApplication {

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(JeecgDemoApplication.class, args);
    }
}
