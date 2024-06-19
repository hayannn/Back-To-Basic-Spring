package com.springboot.api.controller;


import com.springboot.api.dto.MemberDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    //Logback 적용하기
    private final Logger LOGGER = LoggerFactory.getLogger(GetController.class);

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello World";
    }

    // 매개 변수가 없는 GET 메서드 구현
    @GetMapping(value = "/name")
    public String getName(){
        return "Flature";
    }

    // @PathVariable을 활용한 GET 메서드 구현 -> {String 값}
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    // @PathVariable에 변수명을 매핑하는 방법
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var){
        return var;
    }

    // @RequestParam을 활용한 GET 메서드 구현

    @ApiOperation(value = "GET 메서드 예제", notes = "@RequestParam을 활용한 GET Method")
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @ApiParam(value = "이름", required = true) @RequestParam String name,
            @ApiParam(value = "이메일", required = true) @RequestParam String email,
            @ApiParam(value = "회사", required = true)@RequestParam String organization) {
        return name + " " + email + " " + organization;
    }

    //@RequestParam과 Map을 조합한 GET 메서드 구현
    @GetMapping(value = "request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    // DTO 객체를 활용한 GET 메서드 구현
    @GetMapping(value = "request3")
    public String getRequestParam3(MemberDTO memberDTO) {
        return memberDTO.toString();
    }
}