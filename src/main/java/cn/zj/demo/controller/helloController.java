package cn.zj.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/hello")
    public String hello(){
        System.out.println("firstBranch");
        return "hello git4444+firstBranch";

    }
}
