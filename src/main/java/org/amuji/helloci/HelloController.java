package org.amuji.helloci;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Xiangrong Yang
 * 24/09/2017
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    public Hello hello() {
        return new Hello("Hello, world");
    }
}

class Hello {
    String text;
    String to;

    public Hello() {
    }

    public Hello(String text) {
        this.text = text;
    }

    public Hello(String text, String to) {
        this.text = text;
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
