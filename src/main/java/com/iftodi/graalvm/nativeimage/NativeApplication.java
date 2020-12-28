package com.iftodi.graalvm.nativeimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(proxyBeanMethods = false)
public class NativeApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeApplication.class, args);
    }
}