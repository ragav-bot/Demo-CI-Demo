package com.example.SampleConsumer.service.impl;

import com.example.SampleConsumer.service.NumberTypeCheckService;
import com.example.SampleConsumer.util.NumberType;
import org.springframework.stereotype.Component;

@Component
public class EvenNumberCheckServiceImpl implements NumberTypeCheckService {

    @Override
    public String checkNumberType(Integer number) {
        return number % 2 == 0 ? NumberType.EVEN.getValue() : NumberType.ODD.getValue();
    }
}
