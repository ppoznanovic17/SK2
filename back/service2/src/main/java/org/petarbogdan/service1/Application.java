package org.petarbogdan.service1;

import org.petarbogdan.service1.dao.SubscriptionDao;
import org.petarbogdan.service1.dao.UserDao;
import org.petarbogdan.service1.domain.SubscriptionModel;
import org.petarbogdan.service1.domain.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {



	public static void main(String[] args) {


		SpringApplication.run(Application.class, args);
	}




}
