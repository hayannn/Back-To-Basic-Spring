package com.springboot.api.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    /*@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello World";
    }*/

    /*매개 변수가 없는 GET 메서드 구현
    @GetMapping(value = "/name")
    public String getName(){
        return "Flature";
    }
     */

    // @PathVariable을 활용한 GET 메서드 구현 -> {String 값}
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }
}