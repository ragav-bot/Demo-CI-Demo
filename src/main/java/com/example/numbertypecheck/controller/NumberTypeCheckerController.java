package com.example.numbertypecheck.controller;

import com.example.numbertypecheck.service.NumberTypeCheckService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;

@RestController
public class NumberTypeCheckerController {

    Logger log = LoggerFactory.getLogger(NumberTypeCheckerController.class);

    @Autowired
    private NumberTypeCheckService numberTypeCheckService;

    /**
     * Controller with Path Param
     * @param number
     * @return
     */
    @RequestMapping(value = "/validate/numberType/{number}", method = RequestMethod.POST)
    public String checkNumberTypeFromPath(@PathVariable ("number") @NotBlank  Integer number) {
        log.info("Inside checkNumberTypeFromPath:: Inputvalue ::: {}",number);
        return numberTypeCheckService.checkNumberType(number);
    }

    /**
     * Controller with Query Param
     * @param number
     * @return
     */
    @RequestMapping(value = "/validate/numberType", method = RequestMethod.POST)
    public String checkNumberTypeFromQuery(@RequestParam ("number") @NotBlank  Integer number) {
        log.info("Inside checkNumberTypeFromQuery:: InputValue :: {}",number);
        return numberTypeCheckService.checkNumberType(number);
    }
}