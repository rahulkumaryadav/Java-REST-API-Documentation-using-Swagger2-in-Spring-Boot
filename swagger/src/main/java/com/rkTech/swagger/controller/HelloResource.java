package com.rkTech.swagger.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "HelloWorld resouce",description = "Shows hello world")
public class HelloResource {

    @ApiOperation(value = "Returns Hello World")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100,message = "100 is the message"),
                    @ApiResponse(code = 200,message = "Successfull hello world")
            }
    )
    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @PostMapping("post")
    public String helloPost(@RequestBody final String hello){
        return hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello){
       return hello;
    }
}
