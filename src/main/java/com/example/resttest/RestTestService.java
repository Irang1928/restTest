package com.example.resttest;

import javax.naming.OperationNotSupportedException;

public interface RestTestService {
    String restTestResult(String key) throws OperationNotSupportedException;
}
