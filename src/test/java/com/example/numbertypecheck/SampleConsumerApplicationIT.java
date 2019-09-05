package com.example.numbertypecheck;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleConsumerApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class SampleConsumerApplicationIT {

	@Test
	public void main() {
		SampleConsumerApplication.main(new String[] {});
	}


}
