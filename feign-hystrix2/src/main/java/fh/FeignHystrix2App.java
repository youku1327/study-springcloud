package fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author lsc
 * <p> </p>
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class FeignHystrix2App {

    public static void main(String[] args) {
        SpringApplication.run(FeignHystrix2App.class,args);
    }
}
