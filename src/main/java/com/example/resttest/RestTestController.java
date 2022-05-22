package com.example.resttest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.naming.OperationNotSupportedException;

@Controller
public class RestTestController {
    //TODO : logback.xml 설정 하는법
    //TODO : slf4j 사용법, info, warn, error 세가지 정도씀
    public static final Logger logger = LoggerFactory.getLogger(RestTestController.class);

    //TODO : Autowired 알아보기
    @Autowired
    RestTestService service;

    //TODO : RequestMapping 알아보기
    @RequestMapping(path = "/*")
    public ResponseEntity<String> restTest(@RequestParam("key") String key) {
        try {
            return ResponseEntity.ok(service.restTestResult(key));
        } catch (OperationNotSupportedException e) {
            logger.error("key doesn't support!", e);

            return ResponseEntity.badRequest().build();
//          return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }
    }

}
