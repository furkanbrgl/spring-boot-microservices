package com.furakanbrgl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ApiGatewayTestController {
    //we need to map it. for routing
    @RequestMapping("/ag")
    public String getMovieRating() {
        System.out.println("Api gateway test");
        return "ApiGatewayTest";
    }


}
