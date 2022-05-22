package com.example.resttest;

import org.springframework.stereotype.Service;

import javax.naming.OperationNotSupportedException;

@Service
public class RestTestServiceImpl implements RestTestService{
    public String restTestResult(String key) throws OperationNotSupportedException {
        return RestTestEnum.of(key).name();
    }
}
