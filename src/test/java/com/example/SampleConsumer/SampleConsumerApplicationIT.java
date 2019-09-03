package com.example.SampleConsumer;

import com.example.SampleConsumer.controller.NumberTypeCheckerController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleConsumerApplicationIT {

	@Autowired
	private NumberTypeCheckerController numberTypeCheckerController;

	private static ConfigurableApplicationContext appContext;

	@Test
	public void main() {
		SampleConsumerApplication.main(new String[] {});
	}


}
