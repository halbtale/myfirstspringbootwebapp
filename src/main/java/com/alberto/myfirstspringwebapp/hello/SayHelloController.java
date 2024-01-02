package com.alberto.myfirstspringwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        return """
                <html>
                    <head><title>Website</title></head>
                    <body>My first spring html page</body>
                </html>
                """;
    }

    @RequestMapping("say-hello-jsp")
    public String sayhelloJsp() {
        return "sayHello";
    }
}
