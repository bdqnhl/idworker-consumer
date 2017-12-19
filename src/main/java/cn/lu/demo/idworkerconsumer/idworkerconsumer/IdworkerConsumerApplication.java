package cn.lu.demo.idworkerconsumer.idworkerconsumer;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubboConfiguration
@ComponentScan("cn.lu.demo.idworkerconsumer.controller")
public class IdworkerConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdworkerConsumerApplication.class, args);
	}
}
