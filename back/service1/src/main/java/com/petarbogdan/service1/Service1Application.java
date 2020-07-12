package com.petarbogdan.service1;

import com.petarbogdan.service1.service.OutputChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
@EnableBinding(OutputChannel.class)
public class Service1Application {



	public static void main(String[] args) {



		SpringApplication.run(Service1Application.class, args);
	}

}
