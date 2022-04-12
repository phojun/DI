package com.company.ioc;

import java.util.Base64;

public class Encoder { //DI개념 적용

    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder){
        //this.iEncoder = new Base64Encoder();
        this.iEncoder = iEncoder;
    }

    public String encode(String message){

        return iEncoder.encode(message);
    }
}
