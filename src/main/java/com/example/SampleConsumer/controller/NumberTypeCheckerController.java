package com.example.SampleConsumer.controller;

import com.example.SampleConsumer.service.NumberTypeCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;

@RestController
public class NumberTypeCheckerController {

    @Autowired
    private NumberTypeCheckService numberTypeCheckService;

    /**
     * Controller with Path Param
     * @param number
     * @return
     */
    @RequestMapping(value = "/validate/numberType/{number}", method = RequestMethod.POST)
    public String checkNumberTypeFromPath(@PathVariable ("number") @NotBlank  Integer number) {
        return numberTypeCheckService.checkNumberType(number);
    }

    /**
     * Controller with Query Param
     * @param number
     * @return
     */
    @RequestMapping(value = "/validate/numberType", method = RequestMethod.POST)
    public String checkNumberTypeFromQuery(@RequestParam ("number") @NotBlank  Integer number) {
        return numberTypeCheckService.checkNumberType(number);
    }
}
