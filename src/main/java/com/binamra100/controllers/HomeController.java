package com.binamra100.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("${app.version}")
    private String appVersion;

    private static final String APP_VERSION = "app-version";

    @GetMapping
    @RequestMapping("/")
    public Map<String, String> map(){
        Map<String, String>  map = new HashMap<>();
        map.put(APP_VERSION, appVersion);
        return map;
    }
}
