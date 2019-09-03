package com.example.SampleConsumer.service;

import com.example.SampleConsumer.service.impl.NumberTypeCheckServiceImpl;
import com.example.SampleConsumer.util.NumberType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NumberTypeCheckServiceImplTest {

    private NumberTypeCheckService numberTypeCheckService;

    @Before
    public void setup(){
        numberTypeCheckService = new NumberTypeCheckServiceImpl();
    }

    @Test
    public void checkIsPrimeNumberReturnOdd() throws Exception{

        String result;
        result = numberTypeCheckService.checkNumberType(3);
        Assert.assertEquals(result, NumberType.ODD.getValue());
    }

    @Test
    public void checkIsPrimeNumberReturnEven() throws Exception{

        String result;
        result = numberTypeCheckService.checkNumberType(2);
        Assert.assertEquals(result, NumberType.EVEN.getValue());
    }

}