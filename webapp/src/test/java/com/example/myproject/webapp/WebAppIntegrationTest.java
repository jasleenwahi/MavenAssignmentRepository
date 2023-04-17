package com.example.myproject.webapp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = WebApp.class)
public class WebAppIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHelloWorldEndPoint_WithRestTemplate_ShouldReturnHelloWorld() {
        String response=restTemplate.getForObject("http://localhost:8080/hello", String.class);
        assertEquals("Hello World!", response);
    }
}