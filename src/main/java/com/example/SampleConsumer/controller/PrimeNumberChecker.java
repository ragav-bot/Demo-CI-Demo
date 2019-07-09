package com.example.SampleConsumer.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class PrimeNumberChecker {

    @RequestMapping(value = "/validate/prime-number", method = RequestMethod.POST)

    public String isNumberPrime(@RequestParam("number") Integer number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
