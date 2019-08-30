package com.example.SampleConsumer;

import com.example.SampleConsumer.controller.NumberTypeCheckerController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleConsumerApplicationTests {

	@Autowired
	private NumberTypeCheckerController numberTypeCheckerController;
	@Test
	public void contextLoads() throws Exception {
		Assert.assertNotNull(numberTypeCheckerController);
	}

}
