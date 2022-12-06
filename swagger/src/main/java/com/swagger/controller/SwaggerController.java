package com.swagger.controller;

import com.swagger.model.SwaggerModel;
import com.swagger.service.SwaggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/swagger")
public class SwaggerController {

    @Autowired
    private SwaggerService swaggerService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello..";
    }

    @PostMapping("/saveData")
    public SwaggerModel saveData(@RequestBody SwaggerModel swaggerModel) {
        return swaggerService.saveData(swaggerModel);
    }
}
