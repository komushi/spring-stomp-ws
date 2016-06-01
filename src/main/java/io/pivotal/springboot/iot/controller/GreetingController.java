package io.pivotal.springboot.iot.controller;

/**
 * Created by lei_xu on 5/31/16.
 */
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;
import io.pivotal.springboot.iot.domain.*;

@RestController
public class GreetingController {


    @MessageMapping("/textgreet")
    @SendTo("/topic/textgreetings")
    public String textgreeting(String name) throws Exception {
        Thread.sleep(1000); // simulated delay
        return "Hello " + name;
    }

    @MessageMapping("/jsongreet")
    @SendTo("/topic/jsongreetings")
    public OutboundGreeting jsongreeting(InboundHello message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new OutboundGreeting("Hello, " + message.getName() + "!");
    }

}