package com.example.SampleConsumer.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NumberTypeCheckerControllerIT {

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();
    HttpHeaders headers = new HttpHeaders();

    @Test
    public void testNumberTypeCheckerReturnEvenForPathParam() throws Exception{
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("validate/numberType/2"), HttpMethod.POST, entity, String.class);
        String actual = response.getBody().toString();
        Assert.assertEquals("Even",actual);

    }

    @Test
    public void testNumberTypeCheckerReturnOddForPathParam() throws Exception{
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("validate/numberType/3"), HttpMethod.POST, entity, String.class);
        String actual = response.getBody().toString();
        Assert.assertEquals("Odd",actual);

    }

    @Test
    public void testNumberTypeCheckerReturnBadRequestForPathParam() throws Exception{
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("validate/numberType/abc"), HttpMethod.POST, entity, String.class);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.BAD_REQUEST);

    }

    @Test
    public void testNumberTypeCheckerReturnEvenForQueryParam() throws Exception{
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("validate/numberType?number=2"), HttpMethod.POST, entity, String.class);
        String actual = response.getBody().toString();
        Assert.assertEquals("Even",actual);

    }

    @Test
    public void testNumberTypeCheckerReturnOddForQueryParam() throws Exception{
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("validate/numberType?number=3"), HttpMethod.POST, entity, String.class);
        String actual = response.getBody().toString();
        Assert.assertEquals("Odd",actual);

    }

    @Test
    public void testNumberTypeCheckerReturnBadRequestForQueryParam() throws Exception{
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("validate/numberType?number=abc"), HttpMethod.POST, entity, String.class);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.BAD_REQUEST);

    }



    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}
