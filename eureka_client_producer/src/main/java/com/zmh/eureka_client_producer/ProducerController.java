package com.zmh.eureka_client_producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProducerController {
    @Autowired
    private ProducerService producerService;

    @GetMapping("/work")
    public Object work() {
        return producerService.work();
    }

    @Value(value = "${var}")
    public String var = "";

    @GetMapping("/var")
    public Object var() {
        return var;
    }

    @GetMapping("/")
    public Object index() {
        return "producer index  ";
    }
}
