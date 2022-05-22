package com.example.resttest;

import javax.naming.OperationNotSupportedException;

public enum RestTestEnum {
    A("가"),
    B("나"),
    C("다"),
    ;

    private final String kor;

    RestTestEnum(String kor) {this.kor = kor;}

    public static RestTestEnum of(String kor) throws OperationNotSupportedException{
        for (RestTestEnum restTestEnum : RestTestEnum.values()) {
            if(restTestEnum.kor.equals(kor)) {
                return restTestEnum;
            }
        }
        throw new OperationNotSupportedException("지원되지 않는 문자열입니다.[kor = " + kor + "]");
    }
}
