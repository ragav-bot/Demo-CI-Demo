package com.example.SampleConsumer.service;

import com.example.SampleConsumer.service.impl.EvenNumberCheckServiceImpl;
import com.example.SampleConsumer.util.NumberType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class NumberTypeCheckServiceImplTest {

    private NumberTypeCheckService numberTypeCheckService;

    @Before
    public void setup(){
        numberTypeCheckService = new EvenNumberCheckServiceImpl();
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