package com.example.limitsservicespringboot.controller;

import com.example.limitsservicespringboot.configuration.properties.LimitsProperties;
import com.example.limitsservicespringboot.model.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("limits")
public class LimitsController {
    @Autowired
    private LimitsProperties limitsProperties;
    @GetMapping
    public Limit getlimit(){
        return new Limit(limitsProperties.getMinimum(), limitsProperties.getMaximum());
    }
}
