package com.example.myproject.webapp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebApp.class})
public class WebAppUnitTest {

    @Autowired
    private WebApp webApp;

    @Test
    public void testGetMessage_WithHelloWorld_ShouldReturnExpectedString(){
        String message= webApp.returnHelloWorld();
        assertEquals("Hello World!",message);
    }
}
