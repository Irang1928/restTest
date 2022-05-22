package com.example.resttest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.RequestPath;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.Objects;

@Controller
public class RestTestController {
    @RequestMapping(path = "/*")
    public ResponseEntity <String> testPrint(HttpServletRequest request) {
        String str1 = "가";
        String str2 = "나";
        String str3 = "다";
        String str4 = null;

        if(request.getParameter("key").equals(str1)) {
            str4 = "a";
        }
        else if(request.getParameter("key").equals(str2)) {
            str4 = "b";
        }
        else if(request.getParameter("key").equals(str3)) {
            str4 = "c";
        }

        return new ResponseEntity<String>(str4, HttpStatus.OK);
    }
}
