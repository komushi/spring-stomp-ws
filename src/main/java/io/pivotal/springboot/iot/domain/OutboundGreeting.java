package io.pivotal.springboot.iot.domain;


/**
 * Created by lei_xu on 5/31/16.
 */
public class OutboundGreeting {
    private final String content;

    public OutboundGreeting(String content) {

        this.content = content;
    }


    public String getContent() {
        return content;
    }
}