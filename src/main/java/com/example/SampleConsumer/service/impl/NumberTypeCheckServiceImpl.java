package com.example.SampleConsumer.service.impl;

import com.example.SampleConsumer.service.NumberTypeCheckService;
import com.example.SampleConsumer.util.NumberType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class NumberTypeCheckServiceImpl implements NumberTypeCheckService {

    Logger log = LoggerFactory.getLogger(NumberTypeCheckServiceImpl.class);

    @Override
    public String checkNumberType(Integer number) {
        log.info("Inside checkNumberType:: InputValue ==>"+number);
        return number % 2 == 0 ? NumberType.EVEN.getValue() : NumberType.ODD.getValue();
    }
}
