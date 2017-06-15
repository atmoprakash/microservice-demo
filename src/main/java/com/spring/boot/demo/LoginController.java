package com.spring.boot.demo;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.ResponseWrapper;

@RestController
public class LoginController {

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public String authenticate(@RequestBody LoginDto loginDto, HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        return "789472398749382749837";
    }

    @RequestMapping(value = "/authenticate")
    public String ping() {
        return "789472398749382749837";
    }

    @RequestMapping(value = "/menus")
    public void menus(){

    }

}
