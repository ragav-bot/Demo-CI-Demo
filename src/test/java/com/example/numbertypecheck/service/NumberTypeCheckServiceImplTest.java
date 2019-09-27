package com.example.numbertypecheck.service;

import com.example.numbertypecheck.service.impl.NumberTypeCheckServiceImpl;
import com.example.numbertypecheck.util.NumberType;
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
        Assert.assertEquals(NumberType.ODD.getValue(),result );
    }

    @Test
    public void checkIsPrimeNumberReturnEven() throws Exception{

        String result;
        result = numberTypeCheckService.checkNumberType(2);
        Assert.assertEquals(NumberType.EVEN.getValue(),result);
    }

}