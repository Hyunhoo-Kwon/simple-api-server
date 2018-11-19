package com.elon.apiserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreCotroller {

    @RequestMapping(value = "/recommended")
    public String readingList() throws InterruptedException {
        Thread.sleep(300);
        return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
    }
}
