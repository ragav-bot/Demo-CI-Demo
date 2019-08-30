package com.example.SampleConsumer;

import com.example.SampleConsumer.controller.NumberTypeCheckerController;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleConsumerApplicationTests {

	@Autowired
	private NumberTypeCheckerController numberTypeCheckerController;

	private static ConfigurableApplicationContext appContext;


	@BeforeClass
	public static void startBootApp(){
		appContext = SpringApplication.run(SampleConsumerApplication.class, "");
	}


	@Test
	public void contextLoads() throws Exception {
		Assert.assertNotNull(numberTypeCheckerController);
	}

	@AfterClass
	public static void shutdownBootApp(){
		appContext.close();
	}

}
